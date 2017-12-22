package com.ioExercize;

import java.io.*;

/**
 * Created by Balaji on 1/11/17.
 */
public class MergeAndCreaeNewFile {
    public static void main(String[] args) throws IOException {
        File file1=new File("/home/gokul/Balaji/Git/CoreJavaPrograms/" +
                "src/com/ioExercize/text1.txt");
        File file2=new File("/home/gokul/Balaji/Git/CoreJavaPrograms/" +
                "src/com/ioExercize/text2.txt");
        File file3=new File("/home/gokul/Balaji/Git/CoreJavaPrograms/" +
                "src/com/ioExercize/text3.txt");
        FileWriter fileWriter=new FileWriter("/home/gokul/Balaji/Git/CoreJavaPrograms/" +
                "src/com/ioExercize/text0.txt",true);
        System.out.println(file1.createNewFile());
        System.out.println(file2.createNewFile());
        System.out.println(file3.createNewFile());
        PrintWriter writer1=new PrintWriter(file1);
        PrintWriter writer2=new PrintWriter("/home/gokul/Balaji/Git/CoreJavaPrograms/src/com/ioExercize/text2.txt");
        PrintWriter writer3=new PrintWriter(file3);


        fileWriter.write("\n ***hello Sweet Balaji \n");
        fileWriter.write("hello Sweet Balaji \n");
        fileWriter.write("hello Sweet Balaji \n");
        fileWriter.write("hello Sweet Balaji \n");
        fileWriter.flush();
        writer1.println("Balaji");
        writer1.println("Gokul");
        writer1.println("Prithvi");
        writer1.println("Vicky");
        writer1.println("Saravanan");
        writer1.flush();
        writer2.println("hi");
        for (int i = 0; i <5 ; i++) {
            writer2.println((char)(int)(Math.random()*1000));
        }
        writer2.flush();
        FileReader reader1=new FileReader(file1);
        FileReader reader2=new FileReader(file2);
        BufferedReader breader1=new BufferedReader(reader1);
        String line1=breader1.readLine();
        while (line1!=null){
            writer3.write(line1);
            line1=breader1.readLine();
        }
        BufferedReader breader2=new BufferedReader(reader2);
        String line2=breader2.readLine();
        while (line2!=null){
            writer3.write(line2);
            line2=breader2.readLine();
        }
        writer3.flush();
    }

}
