package com.balaji;

/**
 * Created by Balaji on 2/11/17.
 */
public class ScoreUp135 {
    public static void main(String[] args) {
        String[] key1={"a","a","b","b"};
        String[] answers1={"a","c","b","c"};
        System.out.print("key--> {");
        for (String s:key1) {
            System.out.print(s+",");
        }
        System.out.println("}");
        System.out.print("answers--> {");
        for (String s:answers1) {
            System.out.print(s+",");
        }
        System.out.println("}");
        System.out.println("score--> "+score(key1,answers1));

        String[] key2={"a","a","b","b"};
        String[] answers2={"a","a","b","c"};
        System.out.print("key--> {");
        for (String s:key2) {
            System.out.print(s+",");
        }
        System.out.println("}");
        System.out.print("answers--> {");
        for (String s:answers2) {
            System.out.print(s+",");
        }
        System.out.println("}");
        System.out.println("score--> "+score(key2,answers2));

        String[] key3={"a","a","b","b","b"};
        String[] answers3={"a","a","b","b","?"};
        System.out.print("key--> {");
        for (String s:key3) {
            System.out.print(s+",");
        }
        System.out.println("}");
        System.out.print("answers--> {");
        for (String s:answers3) {
            System.out.print(s+",");
        }
        System.out.println("}");
        System.out.println("score--> "+score(key3,answers3));


    }

    public static int scoreUp(String[] key, String[] answers) {
        int score=0;
        for (int i=0;i<key.length;i++) {
                if (key[i]==answers[i])
                    score+=4;
                else if (answers[i]!="?")
                    score-=1;
                else
                    score+=0;
            }
        return score;
    }
    public static int score(String[] key, String[] answers) {
        int score=0;
        for (int i=0;i<key.length;i++) {
            if (key[i].equals(answers[i]))
                score+=4;
            else if (answers[i].equals("?"))
                score+=0;
            else
                score-=1;
        }
        return score;
    }
}
