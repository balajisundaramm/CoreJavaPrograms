package com.ioExercize;

import java.io.*;

/**
 * Created by Balaji on 14/11/17.
 */
public class ReadAndWriteBr {
    public static void main(String[] args) {
        BufferedReader fr = null;
        BufferedWriter fw = null;
        try {
            fr = new BufferedReader(new FileReader("/home/gokul/Balaji/Git/CoreJavaPrograms" +
                    "/src/com/ioExercize/sample/text1.txt"));
            fw = new BufferedWriter(new FileWriter("/home/gokul/Balaji/Git/CoreJavaPrograms" +
                    "/src/com/ioExercize/sample/write.txt"));
            String c;
            while ((c = fr.readLine()) != null) {
                System.out.println(c);
                fw.write(c);
                fw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (fr != null)
                fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (fw != null)
                fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


