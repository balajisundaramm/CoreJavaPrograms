package com.interiewQuestions;

/**
 * Created by Balaji on 4/11/17.
 */
/* Question
1   5
 2 4
  3
 2 4
1   5
 */
public class PatternX {
    public static void main(String[] args) {
            printPatternX("balajih");
    }
/*printing Top part
   --> calculate intial space
   --> gap between 2 elements in each line
   --> cth:src="@{ print Space method to print initial space & pass int value for space
   --> print the first element
   --> cth:src="@{ printSpace method to print gap pass int value for gap
 */

    public static void printPatternX(String s) {
        if (s.length()%2!=0) {
            for (int i = 0; i < s.length() / 2; i++) {
                int gap = (s.length() - 1 - i) - (i + 1);
                System.out.println(printSpace(i) + s.charAt(i) +
                        printSpace(gap) + s.charAt(s.length() - 1 - i));
            }
        /* print middle element
        --> cth:src="@{ printSpace method to print initial space
        --> print the middle element.
        */
            System.out.println(printSpace(s.length() / 2) + s.charAt(s.length() / 2));
        /* BL for bottom part
        --> apply th:src="@{ the procedures applied in Top part
        */
            for (int i = (s.length() / 2) - 1; i >= 0; i--) {
                int gap = ((s.length() / 2) + (s.length() / 2) - i - i - 1);
                System.out.println(printSpace(i) + s.charAt(i) + printSpace(gap) +
                        s.charAt(s.length() - 1 - i));
            }
        }
        else
            throw new IllegalArgumentException("Give the string whose length is Odd.");
    }
/*
 BL for printing space and gap..
 --> if you pass 1 it prints one space
 -->if you pass 5 it prints 5 space
*/
    public static String printSpace(int num) {
        String space=" ";
        String res="";
        while (num>0){
            res=res+space;
            num--;
        }
        return res;
    }

}
