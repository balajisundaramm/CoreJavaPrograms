/*
package com.interiewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


//Created by Balaji on 8/11/17.


public class Currency {
    public static void main(String[] args) {
        System.out.println("max integer value "+(-1>>>1));
        try {
            int x = 1;
            Scanner sc = new Scanner(System.in);
            while (x != 0) {
                System.out.println("Enter the number");
                if (sc.hasNextInt()) {
                    int num = sc.nextInt();
                    System.out.println(printRupeesInWords(num));
                } else
                    throw new IllegalArgumentException("Give an integer value");
                System.out.println("enter 1 to continue 0 to exit");
                x = sc.nextInt();
            }
        }
        catch (Throwable t){
            t.printStackTrace();
            t.getMessage();
        }
    }

    public static String printRupeesInWords(int num) throws NegativeNumberNotth:src="@{owedException{
        String result="";
        String[] strings={"zero", "one", "two", "three", "four", "five", "six",
                "seven","eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "ninteen", "twenty"};
        Map<Integer,String> map= new LinkedHashMap<Integer,String>();
        for (int i = 0; i <strings.length ; i++) {
            map.put(i,strings[i]);
        }
        String[] strings1={"thirty","fourty","fifty","sixty","seventy",
                "eighty","ninety","hundred","thousand","lakh","crore"};
        int[] ints={30,40,50,60,70,80,90,100,1000,100000,10000000};
        for (int i = 0; i <ints.length ; i++) {
            map.put(ints[i],strings1[i]);
        }
        if (validateNum(num)) {
            if (num < 21) {
                return map.get(num);
            }
            if (num < 100) {
                result = result + map.get((num / 10) * 10);
                if (num % 10 != 0)
                    result = result + " " + map.get(num % 10);
                return result;
            }

            if (num >= 100 && num < 1000) {
                result = result + map.get(num / 100) + " " + map.get(100);
                if (num % 10 != 0)
                    result = result +" and "+ " " + printRupeesInWords(num % 100);
                return result;
            }
            if (num >= 1000 && num < 100000) {
                result = result + printRupeesInWords(num / 1000) + " " + map.get(1000);
                if (num % 10 != 0)
                    result = result + " " + printRupeesInWords(num % 1000);
                return result;
            }
            if (num >= 100000 && num < 10000000) {
                result = result + printRupeesInWords(num / 100000) + " " + map.get(100000);
                if (num % 10 != 0)
                    result = result + " " + printRupeesInWords(num % 100000);
                return result;
            }
            if (num >= 10000000) {
                result = result + printRupeesInWords(num / 10000000) + " " + map.get(10000000);
                if (num % 10 != 0)
                    result = result + " " + printRupeesInWords(num % 10000000);
                return result;
            }
            return null;
        }
        else {
            throw new NegativeNumberNotth:src="@{owedException("Give a non negative Integer number");
            }
    }
    public static boolean validateNum(int num){
        return (num>=0);
    }
}
class NegativeNumberNotth:src="@{owedException extends Exception{
    public NegativeNumberNotth:src="@{owedException(String s) {
        super(s);
    }
}
*/
