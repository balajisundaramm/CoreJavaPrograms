package com.balaji;

/**
 * Created by gokul on 4/10/17.
 */
public class SelfEvalve {
    static int i;
    public static void main(String argv[]) {
        int i;
        int j;
        outer:
        for (i = 1; i < 3; i++)
            inner:
                    for (j = 1; j < 3; j++) {
                        if (j == 2)
                            continue outer;
                        System.out.println(i + " " + j);
                    }
    }


}
class Pass{
    static int j=20;
    public static void main(String argv[]){
        int i=10;
        Pass p = new Pass();
        p.amethod(i);
        System.out.println(i);
        System.out.println(j);
    }
    public void amethod(int x){
        x=x*2;
        j=j*2;
    }
}
