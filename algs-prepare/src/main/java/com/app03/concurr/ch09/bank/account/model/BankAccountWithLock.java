package com.app03.concurr.ch09.bank.account.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountWithLock {
    private int id;
    private long amount;
    private Lock lock = new ReentrantLock();

    public BankAccountWithLock(int id, long amount) {
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

    public Lock getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
