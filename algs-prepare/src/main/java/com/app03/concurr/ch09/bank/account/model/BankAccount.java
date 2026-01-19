package com.app03.concurr.ch09.bank.account.model;

public class BankAccount {
    private int id;
    private long amount;

    public BankAccount(int id, long amount) {
        this.id = id;
        this.amount = amount;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
