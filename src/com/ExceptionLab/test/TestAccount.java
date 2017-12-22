package com.ExceptionLab.test;

import com.ExceptionLab.UttaraEx.Account;
import com.balaji.A;

import java.math.BigDecimal;

/**
 * Created by Balaji on 26/10/17.
 */
public class TestAccount {
    public static void main(String[] args) {
        System.out.println("Main starting...");
        try {

            Account a1 = new Account("Balaji", new BigDecimal(500));
            Account a2 = new Account("Prithvi", new BigDecimal(5000));
            //a1.credit(new BigDecimal(10));
            a1.credit(new BigDecimal(1000));
            //a1.debit(new BigDecimal(50));
            a2.credit(new BigDecimal(10000));
            a2.debit(new BigDecimal(500));
            a1=null;
            a1.checkBalance();

        }
        catch (Throwable e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Main ended");
    }
}
