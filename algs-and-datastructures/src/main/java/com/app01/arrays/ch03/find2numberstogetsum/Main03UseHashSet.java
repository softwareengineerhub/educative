/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch03.find2numberstogetsum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author asusadmin
 */
public class Main03UseHashSet {

    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int[] res = findSum(arr, 27);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findSum(int[] arr, int n) {
        int[] res = new int[2];
        Set<Integer> set = new HashSet();        
        for(int i=0;i<arr.length;i++){            
            if(set.contains(n-arr[i])){                
                res[0] = n-arr[i];
                res[1] = arr[i];
                break;
            }
            set.add(arr[i]);
        }        
        return res;
    }

}
