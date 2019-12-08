/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch02.mergesorted;

import java.util.Arrays;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5} ;
        int[] arr2 = {2, 6, 7, 8};
        int[] res = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(res));
        System.out.println("---------------------------");
        int[] data = new int[]{0,1,2,3,4,5,6,7,8,9};
        int[] dataCopy = new int[data.length];
        int i=0;
        int j=0;        
        while(i<data.length){
            dataCopy[j++] = data[i++];
        }       
        System.out.println(Arrays.toString(dataCopy));
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int index = 0;
        while (leftIndex < arr1.length && rightIndex < arr2.length) {
            if (arr1[leftIndex] < arr2[leftIndex]) {
                merged[index] = arr1[leftIndex++];
            } else {
                merged[index] = arr1[rightIndex++];
            }
            index++;
        }
        System.arraycopy(arr1, leftIndex, merged, index, arr1.length - leftIndex);
        System.arraycopy(arr2, rightIndex, merged, index, arr2.length - rightIndex);
        return merged;
    }
    
}
