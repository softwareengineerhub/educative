/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch04.findproduct;

import java.util.Arrays;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        arr = findProduct(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] findProduct(int[] arr){
        int[] res = new int[arr.length];
        int product = 1;
        for(int i=0;i<arr.length;i++){
            product*=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            res[i]=product/arr[i];
        }
        
        
        return res;
    }
    
}
