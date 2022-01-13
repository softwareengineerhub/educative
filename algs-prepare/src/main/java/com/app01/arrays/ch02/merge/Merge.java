package com.app01.arrays.ch02.merge;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        Merge merge = new Merge();
        int[] left = {1,3,4,5};
        int[] right = {2,6,7,8};
        int[] res = merge.mergeArrays(left, right);
        System.out.println(Arrays.toString(res));
    }

    int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int index = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < arr1.length && rightIndex < arr2.length) {
            if(arr1[leftIndex]<arr2[rightIndex]){
                res[index++] = arr1[leftIndex++];
            } else {
                res[index++] = arr2[rightIndex++];
            }
        }
        System.arraycopy(arr1, leftIndex, res, index, arr1.length-leftIndex);
        System.arraycopy(arr2, rightIndex, res, index, arr2.length-rightIndex);
        return res;
    }

}
