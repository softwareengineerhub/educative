package com.app03.concurr.ch09.bank.account.sample02.concur;

import com.app03.concurr.ch09.bank.account.model.BankAccount;
import com.app03.concurr.ch09.bank.account.sample01.simple.TransferService;

public class ConcurrentMain {

    public static void main(String[] args) throws InterruptedException {
        BankAccount from = new BankAccount(1, 2000);
        BankAccount to = new BankAccount(2, 1000);
        System.out.println("from="+from);
        System.out.println("to="+to);
        ConcurrentTransferService transferService = new ConcurrentTransferService();

        Thread t1 = new Thread(()->{
            transferService.transfer(from, to, 500);
        });
        Thread t2 = new Thread(()->{
            transferService.transfer(to, from, 1000);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("from="+from);
        System.out.println("to="+to);
    }
}
