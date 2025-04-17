package com.app00.ch08.simple;

public class RevertNumber {

    public static void main(String[] args) {
        int res = revert(12034);
        System.out.println(res);
    }

    private static int revert(int value){
        if (value % 10 == 0) {
            return value;
        }
        int res = 0;
        while (value / 10 != 0 || Math.abs(value) < 10) {
            res = res * 10 + value % 10;
            value = value / 10;
            if(value==0){
                break;
            }
        }
        return res;
    }

}
