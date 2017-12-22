package com.ioExercize;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Balaji on 14/11/17.
 */
public class PathReading {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the path");
        String path = s1.nextLine();
        File f = new File(path);
        if (f.exists()) {
            System.out.println(f.exists());
            if (f.isFile() && f.getName().contains(".txt")) {
                readInputs(f);
            }
            if (f.isDirectory()) {
                File[] fa = f.listFiles();
                for (File file : fa) {
                    readInputs(file);
                }
            }
        } else {
            System.out.println("file not exist...");
        }
    }

    public static void readInputs(File f) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(f));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
            System.out.println("----------");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (reader != null)
                reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
