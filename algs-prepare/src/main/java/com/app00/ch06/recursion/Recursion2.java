package com.app00.ch06.recursion;

public class Recursion2 {

    public static void main(String[] args) {
        boolean res = hasNumber(new int[]{4,10,8,-7,4}, 11);
        System.out.println("res="+res);
    }

    private static boolean hasNumber(int[] data, int target) {
        return hasNumber(data, target, 0);
    }

    private static boolean hasNumber(int[] data, int target, int step) {
        if (step == data.length - 1) {
            return target == data[step];
        }
        return hasNumber(data, target - data[step], step + 1) || hasNumber(data, target, step + 1);
    }
}
