package com.ioExercize;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Balaji on 14/11/17.
 */
public class WordsMaxOccurance {
    public static void main(String[] args) {
        File f = new File("/home/gokul/Balaji/Git/CoreJavaPrograms/" +
                "src/com/ioExercize/sample/write.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
            List<String> list = new ArrayList<String>();
            String[] sa = null;
            int max = 0, a = 0;
            String result = "";
            if (f.exists() && f.isFile()) {
                String line;
                while ((line = br.readLine()) != null) {
                    sa = (line.split(" "));
                    for (String s : sa) {
                        list.add(s);
                    }
                }
                for (String s : list) {
                    /*if(Collections.frequency(list,s)>max){
                        max=Collections.frequency(list,s);
                        result=s;
                    }*/
                    a = Collections.frequency(list, s);
                    if (max < a) {
                        max = a;
                        result = s;
                    }


                }
            }
            System.out.println(result);
            // System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (br != null) {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
