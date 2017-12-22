package com.ioExercize;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Balaji on 14/11/17.
 */
public class TestIo {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the path");
        //String path=s1.nextLine();
        File f=new File("/home/gokul/Balaji/Git/CoreJavaPrograms/" +
                "src/com/ioExercize/text1.txt");
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        System.out.println(f.exists());



        File f2=new File("/home/gokul/Balaji/Git/CoreJavaPrograms/" +
                "src/com/ioExercize/sample");

        System.out.println(f2.exists());
        System.out.println(f2.isFile());
        System.out.println(f2.mkdir());
        System.out.println(f2.isDirectory());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getName());
        File[] fa=f2.listFiles();
        for (File file:fa) {
            System.out.println(file);
        }


    }
}
