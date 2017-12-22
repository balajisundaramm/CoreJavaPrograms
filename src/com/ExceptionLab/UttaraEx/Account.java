package com.ExceptionLab.UttaraEx;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Balaji on 26/10/17.
 */
public class Account {
    private String owner;
    private BigDecimal balance;

    public Account(String owner, BigDecimal balance){
        if (owner==null)
            throw new IllegalArgumentException("owner should not be null");
        else
            this.owner = owner;
        if (balance.doubleValue()<0)
            throw new IllegalArgumentException("Amount should not be negive");
        else
            this.balance = balance;
    }

    public BigDecimal credit(BigDecimal amt) throws InsufficientCreditException{
         if (amt.doubleValue()<100)
             throw new InsufficientCreditException("Atleast credit minimum 100.");
         else {
             checkBalance();
             balance = balance.add(amt);
             System.out.println("Amount "+amt+" credited to the account "+owner+" successfully");
             checkBalance();
         }
        return balance;
    }
    public BigDecimal debit(BigDecimal amt) throws InsufficientDebitException{
        if (amt.doubleValue()<100)
            throw new InsufficientDebitException("Atleast debit minimum 100.");
        else {
            balance = balance.subtract(amt);
            System.out.println("Amount "+amt+" debited from the account "+owner+" successfully");
            checkBalance();
        }
        return balance;
    }
    public void checkBalance(){
        System.out.println("Your balance in the account "+owner+" is-->"+balance);
    }
}
class InsufficientCreditException extends Exception{
    public InsufficientCreditException() {
    }

    public InsufficientCreditException(String s) {
        super(s);
    }
}
class InsufficientDebitException extends Exception{
    public InsufficientDebitException() {
    }

    public InsufficientDebitException(String s) {
        super(s);
    }
}
