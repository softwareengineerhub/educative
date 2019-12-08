/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch09.rearrangenumbersnegativeandpositive;

import java.util.Arrays;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        reArrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void reArrange(int[] arr) {
        int[] res = new int[arr.length];
        int j=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                res[j++] = arr[i];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                res[j++] = arr[i];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] = res[i];
        }
        
    }
}
