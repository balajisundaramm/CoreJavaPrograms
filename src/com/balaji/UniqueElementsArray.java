package com.balaji;

import java.util.*;

/**
 * Created by Balaji on 31/10/17.
 */
public class UniqueElementsArray {
    public static void main(String[] args) {
        int x=1;
        Scanner scanner = new Scanner(System.in);
        while (x!=0) {
            System.out.println("Enter the size of the array");
            scanner = new Scanner(System.in);
            int[] a =new int[scanner.nextInt()];
            for (int i = 0; i <a.length ; i++) {
                System.out.println("Enter the elements of array");
                a[i]= scanner.nextInt();
            }

            System.out.println("Enter the size of the array");
            int[] b =new int[scanner.nextInt()];
            for (int i = 0; i <b.length ; i++) {
                System.out.println("Enter the elements of array");
                b[i]= scanner.nextInt();
            }
            System.out.println("Unique elements are..");
            for (int i:createUniqueElementArray(a,b)) {
                System.out.println(i);
            }

            System.out.println("Enter 1 to continue or 0 to exit");
            x = scanner.nextInt();
        }

    }
    public static int[] createUniqueElementArray(int[] a , int [] b) {
        int count=0;
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int i : a) {
            set.add(i);
        }
        for (int i:b) {
            set.add(i);
        }
        int[] result=new int[set.size()];
        for (Object o:set) {
            result[count++]=(Integer)o;
        }
        return result;
    }

}
