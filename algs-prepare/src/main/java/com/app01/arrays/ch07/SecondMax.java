package com.app01.arrays.ch07;

import java.util.Arrays;

public class SecondMax {

    int findSecondMaximum(int[] arr){
        int maxFirst = Math.max(arr[0], arr[1]);
        int maxSecond = Math.min(arr[0], arr[1]);
        for(int i=2;i<arr.length;i++){
            if(arr[i]>maxFirst){
                maxSecond=maxFirst;
                maxFirst=arr[i];
            } else if(arr[i]>maxSecond){
                maxSecond=arr[i];
            }
        }
        return maxSecond;
    }


    int findSecondMaximum2(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

}
