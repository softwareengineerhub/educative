/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch07.secondmax;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {9,2,3,6};
        int res = findSecondMaximum(arr);
        System.out.println(res);
    }
    
    public static int findSecondMaximum(int[] arr){
        int secondMax = arr[1];
        int max = arr[0];        
        if(secondMax>max){
            max = arr[1];
            secondMax = arr[0];
        }
        
        for(int i=3;i<arr.length;i++){
            if(max<arr[i]){
                secondMax = max;
                max = arr[i];
            } else if(secondMax<arr[i]){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    
}
