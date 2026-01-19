package com.app03.concurr.ch09.bank.account.sampleo4.rwlock;

import com.app03.concurr.ch09.bank.account.model.BankAccountWithRWLock;

public class ConcurrentRWLockMain {

    public static void main(String[] args) throws InterruptedException {
        BankAccountWithRWLock from = new BankAccountWithRWLock(1, 2000);
        BankAccountWithRWLock to = new BankAccountWithRWLock(2, 1000);
        System.out.println("from=" + from);
        System.out.println("to=" + to);
        ConcurrentTransferRWLocksService transferService = new ConcurrentTransferRWLocksService();

        Thread t1 = new Thread(() -> {
            try {
                transferService.transfer(from, to, 500, 10000, 2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                transferService.transfer(to, from, 1000, 2000, 3);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                transferService.transfer(from, to, 99900, 10000, 2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("from=" + from);
        System.out.println("to=" + to);
    }
}
