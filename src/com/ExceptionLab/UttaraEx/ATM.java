/*
package com.ExceptionLab.UttaraEx;

*/
/**
 * Created by Balaji on 26/10/17.
 *//*

public class ATM {
    private String name;
    public void withdraw(Card c,double amt) throws NotEnoughBalanceException{
        if (c==null)
            throw new IllegalArgumentException("Card Should not be null");
        if (amt<=0)
            throw new IllegalArgumentException("Amound should not be negative");
        if (amt>c.balance)
            throw new NotEnoughBalanceException("Your Balance is "+c.balance+" amount should be less than "+c.balance);
        else {
            System.out.println("Your balance in the card "+c.owner+" before withdraw is "+c.balance);
            c.balance = c.balance - amt;
            System.out.println("You have Withdrawn-->"+amt);
        }
        System.out.println("Your balance in the card "+c.getOwner()+" is-->"+c.balance);
    }
}
class NotEnoughBalanceException extends Exception {
    public NotEnoughBalanceException() {
    }

    public NotEnoughBalanceException(String s) {
        super(s);
    }
}
*/
