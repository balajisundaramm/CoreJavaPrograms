package com.interiewQuestions;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Balaji on 4/11/17.
 */
public class SortingMergedArray {
    public static void main(String[] args) {
        int[] a={4,6,8,1,2};
        int[] b={8,3,2,7,12};
        for (int i:sorting(a,b)) {
            System.out.println(i);
        }
    }

    public static int[] sorting(int[] a, int[] b) {
        Set<Integer> set=new TreeSet<Integer>();
        for (int i:a) {
            set.add(i);
        }
        for (int i:b) {
            set.add(i);
        }
        int[] res=new int[set.size()];
        int count=0;
        for (Object o:set) {
            res[count++]=(Integer)o;
        }
        return res;
    }
}
