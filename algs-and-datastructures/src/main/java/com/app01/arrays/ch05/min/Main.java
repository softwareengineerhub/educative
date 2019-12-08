/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch05.min;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {1,8,3,0,2,8};
        int min = min(arr);
        System.out.println(min);
    }
    
    public static int min(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    
}
