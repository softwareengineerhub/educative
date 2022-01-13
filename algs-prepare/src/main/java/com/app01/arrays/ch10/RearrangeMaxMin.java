package com.app01.arrays.ch10;

import java.util.Arrays;

public class RearrangeMaxMin {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        maxMin(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void maxMin(int[] arr) {
        int[] tmp = Arrays.copyOf(arr, arr.length);
        int left = 0;
        int right = arr.length-1;
        int index = 0;
        while(left<=right){
            arr[index++] = tmp[right--];
            if(index<arr.length) {
                arr[index++] = tmp[left++];
            }
        }

        /*for(int i=0;i<arr.length;i=i+2){
            System.out.println("\t"+Arrays.toString(arr));
            int tmp = arr[arr.length-1-i];
            for(int j=arr.length-1-i;j>i;j--){
                arr[j] = arr[j-1];
            }
            arr[i] = tmp;
        }*/
    }

}
