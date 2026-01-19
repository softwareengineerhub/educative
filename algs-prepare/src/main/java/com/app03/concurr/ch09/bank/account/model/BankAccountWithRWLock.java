package com.app03.concurr.ch09.bank.account.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BankAccountWithRWLock {
    private int id;
    private long amount;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public BankAccountWithRWLock(int id, long amount) {
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

    public Lock getReadLock() {
        return lock.readLock();
    }

    public Lock getWriteLock() {
        return lock.writeLock();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
