package com.app00.ch08.simple;

public class Fibonacci {

    public static void main(String[] args) {
        generate(15);
    }

    private static void generate(int step){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int index = 2;
        while(index<=step){
            int tmp = b;
            b = a+b;
            a = tmp;
            System.out.println(b);
            index++;
        }
    }

}
