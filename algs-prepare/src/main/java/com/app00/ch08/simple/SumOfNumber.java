package com.app00.ch08.simple;

public class SumOfNumber {

    public static void main(String[] args) {
        int res = sumOfDigests(1234);
        System.out.println(res);
    }

    private static int sumOfDigests(int value){
        int res = 0;
        while(value%10!=0 || Math.abs(value) < 10){
            res+=value%10;
            value = value/10;
        }
        return res;
    }

}
