/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch06.firstnonrepeatable;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 6, 6};
        int res = findFirstUnique(arr);
        System.out.println(res);
        
        arr = new int[]{4, 5, 1, 2, 0, 4};
        res = findFirstUnique(arr);
        System.out.println(res);
    }
    
    public static int findFirstUnique(int[] arr){
        int res = -1;        
        
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        
        return res;
    }
    
}
