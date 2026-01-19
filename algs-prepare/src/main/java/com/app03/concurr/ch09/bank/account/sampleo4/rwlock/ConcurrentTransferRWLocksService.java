package com.app03.concurr.ch09.bank.account.sampleo4.rwlock;

import com.app03.concurr.ch09.bank.account.model.BankAccountWithRWLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class ConcurrentTransferRWLocksService {

    public void transfer(BankAccountWithRWLock from, BankAccountWithRWLock to, int sum, long delay, long timeout) throws InterruptedException {
        System.out.println("-----Started transfer-------");
        Lock fromReadLock = from.getReadLock();
        fromReadLock.lock();
        try {
            long fromCurrentAmount = from.getAmount();
            long updatedAmount = fromCurrentAmount - sum;
            if (updatedAmount < 0) {
                System.out.println("Not enough money");
                return;
            }
        } finally {
            fromReadLock.unlock();
        }


        Lock fromWriteLock = from.getWriteLock();
        System.out.println("Try to get W lock for account=" + from.getId());
        if (fromWriteLock.tryLock(timeout, TimeUnit.SECONDS)) {
            try {

                Lock toWriteLock = to.getWriteLock();

                Thread.sleep(delay);
                System.out.println("Try to get W lock for account=" + to.getId());
                if (toWriteLock.tryLock(timeout, TimeUnit.SECONDS)) {
                    from.setAmount(from.getAmount() - sum);
                    to.setAmount(to.getAmount() + sum);
                } else {
                    System.out.println("Account is busy: " + from.getId());
                }
            } finally {
                fromWriteLock.unlock();
            }
        } else {
            System.out.println("Account is busy: " + from.getId());
        }
        System.out.println("-----Ended transfer-------");
    }

}
