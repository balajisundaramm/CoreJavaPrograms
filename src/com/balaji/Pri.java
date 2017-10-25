
package com.balaji;
import java.lang.*;



    class Base{
        Base(){
            int i = 100;
            System.out.println(i);
        }
    }
    public class Pri{
        /*static int i = 200;
        public static void main(String argv[]){
            Pri p = new Pri();
            System.out.println(i);
        }*/
        public static void main(String[] args) {
            int i;
            for (i = 0; i <= 10; i++) {
                if (i > 6)
                    break;
            }
            System.out.println(i);
            }

    }


