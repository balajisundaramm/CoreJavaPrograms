package com.collectionLab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Balaji on 19/12/17.
 */
public class Testt {

        public static void main(String[] args) {
            ArrayList<Integer> al = new ArrayList<Integer>();
            int []arr={12,1,9,100,72};
            al.add(arr[0]);
            al.add(arr[1]);
            al.add(arr[2]);
            al.add(arr[3]);
            al.add(arr[4]);

            Collections.sort(al,new CompareNumb());
            System.out.println(al);
            for(int s:al)
            {
                System.out.println(s);
            }
        }

    }
    class CompareNumb implements Comparator<Integer>
    {
        @Override
        public int compare(Integer arg0,Integer arg1 ) {
            String  comp1 =Integer.toString(arg0);
            String comp2=Integer.toString(arg1);

            String k=comp1+comp2;
            String k1=comp2+comp1;
            return k1.compareTo(k);
        }
    }


