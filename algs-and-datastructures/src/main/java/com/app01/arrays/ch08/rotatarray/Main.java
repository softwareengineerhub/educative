/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch08.rotatarray;

import java.util.Arrays;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 4, 2};
        rotateArray2(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void rotateArray2(int[] arr){
        int lastItem = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0]=lastItem;        
    }
    
    public static void rotateArray(int[] arr){
        int firstItem = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=firstItem;        
    }
    
}
