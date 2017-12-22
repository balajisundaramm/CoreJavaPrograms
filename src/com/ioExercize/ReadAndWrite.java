package com.ioExercize;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Balaji on 14/11/17.
 */
public class ReadAndWrite {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        try{
            fr=new FileReader("/home/gokul/Balaji/Git/CoreJavaPrograms" +
                    "/src/com/ioExercize/sample/text1.txt");
            fw=new FileWriter("/home/gokul/Balaji/Git/CoreJavaPrograms" +
                    "/src/com/ioExercize/sample/write.txt",true);
            int c;
            while ((c=fr.read())!=-1){
                System.out.println((char)c);
                fw.write(c);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                if (fr!=null)
                    fr.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            try {
                if (fw!=null)
                    fw.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
