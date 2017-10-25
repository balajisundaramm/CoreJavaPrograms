package com.balaji;

/**
 * Created by Balaji on 8/10/17.
 */
public class NoOfOccurance103 {
    public static void main(String[] args) {
        String input="atcatcat";
        String matcher="at";
        System.out.println(findNumOfOccurances(input,matcher));

    }
    public static int findNumOfOccurances(String input,String matcher) {
        // method 1
        /*int count = 0;
        for (int i = 0; i>=0; i++){
            if(input.indexOf(matcher, i)>=0) {
                i = input.indexOf(matcher, i);
                count++;
            }
        }
        return count;*/

        //Method 2
        input=" "+input+" ";
        for (String s:input.split(matcher)) {
            System.out.print(s);
        }
        return (input.split(matcher)).length-1;
    }
}
