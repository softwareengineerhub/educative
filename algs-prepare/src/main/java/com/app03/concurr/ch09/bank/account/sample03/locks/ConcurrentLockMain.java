package com.app03.concurr.ch09.bank.account.sample03.locks;

import com.app03.concurr.ch09.bank.account.model.BankAccountWithLock;

public class ConcurrentLockMain {

    public static void main(String[] args) throws InterruptedException {
        BankAccountWithLock from = new BankAccountWithLock(1, 2000);
        BankAccountWithLock to = new BankAccountWithLock(2, 1000);
        System.out.println("from=" + from);
        System.out.println("to=" + to);
        ConcurrentTransferLocksService transferService = new ConcurrentTransferLocksService();

        Thread t1 = new Thread(() -> {
            try {
                transferService.transfer(from, to, 500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                transferService.transfer(to, from, 1000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("from=" + from);
        System.out.println("to=" + to);
    }
}
