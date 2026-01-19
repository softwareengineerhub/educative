package com.app03.concurr.ch09.bank.account.sample03.locks;

import com.app03.concurr.ch09.bank.account.model.BankAccountWithLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class ConcurrentTransferLocksService {

    public void transfer(BankAccountWithLock from, BankAccountWithLock to, int sum) throws InterruptedException {
        System.out.println("-----Started transfer-------");
        Lock fromLock = from.getLock();

        if (fromLock.tryLock(5, TimeUnit.SECONDS)) {
            try {
                long amount = from.getAmount();
                System.out.println("Current amount=" + amount);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (amount >= sum) {
                    System.out.println("Permitted to make transfer");

                    Lock toLock = to.getLock();
                    if (toLock.tryLock(10, TimeUnit.SECONDS)) {
                        try {
                            System.out.println("Minus from completed");
                            from.setAmount(amount - sum);
                            to.setAmount(to.getAmount() + sum);
                            System.out.println("Plus to completed");
                        } finally {
                            toLock.unlock();
                        }
                    } else {
                        System.out.println("Account with id=" + to.getId() + " is busy");
                    }
                }
            } finally {
                fromLock.unlock();

            }
        } else {
            System.out.println("Account with id=" + from.getId() + " is busy");
        }

        System.out.println("-----Ended transfer-------");
    }

}
