package com.app01.arrays.ch10;

import java.util.Arrays;

public class RearrangeMaxMin2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        maxMin(arr);
       System.out.println(Arrays.toString(arr));
    }


    static void maxMin(int[] arr) {
        int index = 0;
        while(index<arr.length-1){
            rotateArray(arr, index);
            //System.out.println(Arrays.toString(arr));
            index = index+2;
        }
    }

    static void rotateArray(int[] arr, int startIndex){
        int tmp = arr[arr.length-1];
        for(int i=arr.length-1;i>startIndex;i--){
            arr[i]=arr[i-1];
        }
        arr[startIndex]=tmp;
    }

}
