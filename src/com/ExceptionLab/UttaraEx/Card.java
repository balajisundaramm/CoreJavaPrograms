package com.ExceptionLab.UttaraEx;

/**
 * Created by Balaji on 26/10/17.
 */
public class Card {
        private double balance;
        private String owner;

    public Card(double balance, String owner) {
        if (balance<100)
            throw new IllegalArgumentException("Balance shuld be more than 100");
        else
            this.balance = balance;
        if (owner==null)
            throw new IllegalArgumentException("Owner should not be null");
        else
            this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
