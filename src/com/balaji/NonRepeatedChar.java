package com.balaji;
public class NonRepeatedChar {
    public static void main(String[] args) {
        String s = "aaf";
        System.out.println(printUnique(s));
    }

    public static String printUnique(String s) {
        String result = "";
        inner:
        for (int i = 0; i < s.length(); i++) {
            outer:
            for (int j = 0; j < s.length(); j++) {
                if (i != j) {
                    if (s.charAt(i) == s.charAt(j))
                        break outer;
                    if (s.charAt(i) != s.charAt(j))
                        continue outer;
                }
                result = result + s.charAt(i);

            }


        }
        return result;

    }
}



