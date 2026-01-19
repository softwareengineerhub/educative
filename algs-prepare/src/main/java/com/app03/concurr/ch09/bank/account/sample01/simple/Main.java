package com.app03.concurr.ch09.bank.account.sample01.simple;

import com.app03.concurr.ch09.bank.account.model.BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount from = new BankAccount(1, 2000);
        BankAccount to = new BankAccount(2, 1000);
        System.out.println("from="+from);
        System.out.println("to="+to);
        TransferService transferService = new TransferService();
        transferService.transfer2(from, to, 500);
        System.out.println("from="+from);
        System.out.println("to="+to);
    }
}
