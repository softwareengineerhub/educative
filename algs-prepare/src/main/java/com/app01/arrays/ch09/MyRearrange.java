package com.app01.arrays.ch09;

import java.util.Arrays;

public class MyRearrange {

    public static void main(String[] args) {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        reArrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reArrange(int[] arr){
        int positiveCount = 0;
        for(int i: arr){
            if(i>0){
                positiveCount++;
            }
        }
        int[] positiveArray = new int[positiveCount];
        int pIndex = 0;
        int[] otherArray = new int[arr.length-positiveCount];
        int oIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positiveArray[pIndex++] = arr[i];
            } else {
                otherArray[oIndex++] = arr[i];
            }
        }

        for(int i=0;i<otherArray.length;i++){
            arr[i] = otherArray[i];
        }

        for(int i=0;i<positiveArray.length;i++){
            arr[i+otherArray.length] = positiveArray[i];
        }
    }

}
