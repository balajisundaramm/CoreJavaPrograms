package com.interiewQuestions;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Balaji on 19/12/17.
 */
public class PhoneNumIO {
    public static void main(String[] args) {
        BufferedReader reader=null;
        PrintWriter writer=null;
        Pattern pattern=Pattern.compile("(91)?[789]+[0-9]{9}");
        String line=null;
        try {
            FileReader file=new FileReader("/home/gokul/Balaji/Git/CoreJavaPrograms" +
                    "/src/com/ioExercize/sample/text1.txt");
            reader=new BufferedReader(file);
            writer=new PrintWriter(new FileWriter("destination.txt"));
            while ((line=reader.readLine())!=null) {
                Matcher matcher=pattern.matcher(line);
                if (matcher.find()){
                    writer.println(matcher.group());
                }
                writer.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writer!=null){
                writer.close();
            }
        }
    }
}
