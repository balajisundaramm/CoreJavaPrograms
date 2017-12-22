package com.OnlineCoding;

import com.balaji.Simple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Balaji on 18/12/17.
 */
public class Calender {
    public static void main(String[] args) {
        boolean flag=true;
        Date date=null;
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int ch=1;
        while (ch!=0) {
            while (flag) {
                System.out.println("Enter the date (dd/MM/yyyy)");
                String s = sc1.nextLine();
                if (validateDate(s) != null) {
                    date = validateDate(s);
                    System.out.println(mapping(s));
                    flag = false;
                }
                System.out.println("Enter 1 to continue");
                System.out.println("Enter 0 to exit");
                ch=sc2.nextInt();
                flag=true;
            }
        }

    }

    public static String mapping(String s) {
        String result="";
        Map<Integer,String> map=new HashMap<Integer,String>();
        Map<Integer,String> monthMap= new HashMap<>();
        String[] strings={"one","two","three","four","five","six","seven","eight",
                            "nine","ten","eleven","twelve","thirteen","fourteen",
                            "fifteen","sixteen","seventeen","eighteen","nineteen",
                            "twenty","thirty","forty","fifty","sixty","seventy",
                            "eighty","ninety","hundred","thousand"};
        int[] ints={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,
                            60,70,80,90,100,1000,100000};
        String[] months={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep",
                            "Oct","Nov","Dec"};

        for (int i = 0; i <strings.length ; i++) {
            map.put(ints[i],strings[i]);
        }
        map.put(0,"");
        for (int i = 0; i <12 ; i++) {
            monthMap.put(ints[i],months[i]);
        }
        System.out.println(monthMap);

        String[] split=s.split("/");
        int date=Integer.parseInt(split[0]);
        int month=Integer.parseInt(split[1]);
        int year=Integer.parseInt(split[2]);

        if (date>20){
            result=map.get(20)+" "+map.get(date%20);
        }
        else {
            result=map.get(date);
        }

        result=result+" "+monthMap.get(month);

        result=result+" "+map.get(year / 1000)+" "+map.get(1000);
        int secondDigit=((year/100)%10);
        if (secondDigit!=0)
            result=result+map.get(secondDigit)+" "+map.get(100);
        int last=year%100;
        if (last<21 && last!=0){
            result=result+" "+map.get(last);
        }
        if (last>20 && last<100){
            result=result+" "+map.get((last/10)*10)+" "+map.get(last%10);
        }



        return result;
    }



    public static Date validateDate(String s) {
       Pattern dateForamt=Pattern.compile("^[0-9]{2}+[/]+[0-9]{2}+[/]+[0-9]{4}$");
        Matcher matcher=dateForamt.matcher(s);
        Date date=null;
        if (matcher.find()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                date = sdf.parse(s);
                if (!(s.equals(sdf.format(date)))) {
                    System.out.println("The date you entered is invalid. Enter the valid date.");
                    return null;
                }
                else {
                    return date;
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("The date entered is not in the given format.");
            return null;
        }
        return null;
    }
}
