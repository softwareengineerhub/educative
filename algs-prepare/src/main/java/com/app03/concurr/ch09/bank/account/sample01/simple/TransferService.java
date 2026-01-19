package com.app03.concurr.ch09.bank.account.sample01.simple;

import com.app03.concurr.ch09.bank.account.model.BankAccount;

public class TransferService {

    public void transfer(BankAccount from, BankAccount to, int sum) {
        System.out.println("-----Started transfer-------");
        long amount = from.getAmount();
        System.out.println("Current amount=" + amount);
        if (amount >= sum) {
            System.out.println("Permitted to make transfer");
            from.setAmount(amount - sum);
            System.out.println("Minus from completed");
            to.setAmount(to.getAmount() + sum);
            System.out.println("Plus to completed");
        }
        System.out.println("-----Ended transfer-------");
    }

    public void transfer2(BankAccount from, BankAccount to, int sum) {
        long fromCurrentAmount = from.getAmount();
        long value = fromCurrentAmount - sum;
        if (value >= 0) {
            from.setAmount(value);
            to.setAmount(to.getAmount() + sum);
        }
    }

}
