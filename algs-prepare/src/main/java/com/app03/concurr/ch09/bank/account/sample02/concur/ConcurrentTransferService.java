package com.app03.concurr.ch09.bank.account.sample02.concur;

import com.app03.concurr.ch09.bank.account.model.BankAccount;

public class ConcurrentTransferService  {

    public void transfer(BankAccount from, BankAccount to, int sum) {
        System.out.println("-----Started transfer-------");
        synchronized (from) {
            long amount = from.getAmount();
            System.out.println("Current amount=" + amount);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (amount >= sum) {
                System.out.println("Permitted to make transfer");
                from.setAmount(amount - sum);
                System.out.println("Minus from completed");

                //DEAD LOCK
                synchronized (to) {
                    to.setAmount(to.getAmount() + sum);
                }
                System.out.println("Plus to completed");
            }
        }
        System.out.println("-----Ended transfer-------");
    }

}
