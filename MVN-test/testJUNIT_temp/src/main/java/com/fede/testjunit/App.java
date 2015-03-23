package com.fede.testjunit;

public class App {
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//        System.out.println(somma(5, 6));
//
//    }

    public static int somma(int a, int b) {
        if (a == 2) {
            return -1;
        }
        return (a + b);
    }

    public static String upperCase(String str){
        String upperStr = str.toUpperCase();
        return upperStr;
    }

    public static int div(int a, int b) {

        if (b == 0)
            throw new IllegalArgumentException("idiota b non può essere 0");

        return (a / b);
    }
}