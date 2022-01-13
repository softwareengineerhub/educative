package com.app01.arrays.ch03;

import java.util.Arrays;

public class FindNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int[] res = findSum(arr, 27);
        System.out.println(Arrays.toString(res));
    }

    static int[] findSum(int[] arr, int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            int delta = n-arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if(delta==arr[j]){
                    return new int[]{arr[i], delta};
                }
            }
        }
        return null;
    }

}
