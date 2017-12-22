package com.ioExercize;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Balaji on 14/11/17.
 */
public class SortingWords {
    public static void main(String[] args) {
        File f = new File("/home/gokul/Balaji/Git/CoreJavaPrograms/" +
                "src/com/ioExercize/sample/text1.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
            List<String> list = new ArrayList<String>();
            Set<String> set = new TreeSet<String>();
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            System.out.println("List without sorting");
            System.out.println(list);
            Collections.sort(list);
            System.out.println("sorting with dublicates");
            System.out.println(list);
            System.out.println("Sorting without dublicates");
            System.out.println(set);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (br != null)
                br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

