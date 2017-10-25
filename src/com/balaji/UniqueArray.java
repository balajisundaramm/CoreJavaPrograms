package com.balaji;

/**
 * Created by gokul on 2/10/17.
 */
public class UniqueArray {
    public static void main(String [] args){
        int[] a={1,2,4,3,5,2,1};
        for (int x:makeUniQueElementArray(a)) {
            System.out.println(x);
        }


    }
    public static int[] makeUniQueElementArray(int[] a) {
        // First method removes repeated elements from first

        /*int[] temp=new int[a.length];
        int z=0, count=0;
       outer: for (int i = 0; i <a.length ; i++) {
            inner: for (int j = i+1; j <a.length ; j++) {
                if (a[i] == a[j])
                    continue outer;
            }
            temp[z++] = a[i];
            count++;

        }
        int[] result=new int[count];
        for (int i=0;i<count;i++) {
            result[i]=temp[i];
        }
        return result;*/

        // Second method removes repeated elements from last

        int[] temp=new int[a.length];
        temp[0]=a[0];
        int z=1, count=1;
        outer:for (int i = 1; i <a.length ; i++) {
            inner:for (int j = 0; j <i; j++) {
                if (a[i] == temp[j])
                    continue outer;
            }
            temp[z++]=a[i];
            count++;
        }
        int[] result=new int[count];
        for (int i=0;i<count;i++) {
            result[i]=temp[i];
        }
        return result;
    }
}
