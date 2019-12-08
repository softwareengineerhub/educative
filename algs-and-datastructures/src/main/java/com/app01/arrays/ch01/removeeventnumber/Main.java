/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch01.removeeventnumber;

import java.util.Arrays;

/**
 *
 * @author asusadmin
 */
public class Main {
    
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,0};
        data = removeEven(data);
        System.out.println(Arrays.toString(data));
        int a = -11;
        int b = 2;
        int res = a%b;
        System.out.println(res);
    }
    
    public static int[] removeEven(int[] arr) {
        int n = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0 && (arr[i]!=1 ||  arr[i]!=-1)){
                n++;
            }
        }
        System.out.println("n="+n);
        int[] data = new int[n];
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0 && (arr[i]!=1 ||  arr[i]!=-1)){
                data[j++] = arr[i];                
            }
        }        
        return data;
    }
    
}
