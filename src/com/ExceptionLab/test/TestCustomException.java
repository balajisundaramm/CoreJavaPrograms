package com.ExceptionLab.test;

/**
 * Created by Balaji on 26/10/17.
 */
public class TestCustomException {
    public static void main(String[] args) {
        try {
            System.out.println("main starting");
            if (true)
                throw new MyException("This is my exception");
            System.out.println("after using throw");
        } catch (Exception e) {
            System.out.println("In catch msg-->" + e.getMessage());
            e.printStackTrace();
        }
    }
}
    //class MyException extends Exception{
      /*  public MyException(){

        }
        public MyException(String msg){
            super(msg);
        }
    }
}*/
