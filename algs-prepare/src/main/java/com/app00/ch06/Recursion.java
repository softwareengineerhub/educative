package com.app00.ch06;

public class Recursion {

    public static void main(String[] args) {

    }

    private static boolean hasNumber(int[] data, int target) {
        return hasNumber(data, target, 0);
    }

    private static boolean hasNumber(int[] data, int target, int step) {
        if (step>=data.length) {
            return target==0;
        }
        return hasNumber(data, target, step+1) || hasNumber(data, target-data[step], step+1);
    }
}
