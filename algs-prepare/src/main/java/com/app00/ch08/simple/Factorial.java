package com.app00.ch08.simple;

public class Factorial {

    public static void main(String[] args) {
        generate(5);
    }

    private static void generate(int n){
        int p=1;
        for(int i=0;i<n;i++){
            p*=(i+1);
            System.out.println(p);
        }
    }

}
