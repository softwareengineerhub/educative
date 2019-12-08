/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch03.find2numberstogetsum;

import java.util.Arrays;

/**
 *
 * @author asusadmin
 */
public class Main01BruteForce {
    
    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int[] res = findSum(arr, 27);
        System.out.println(Arrays.toString(res));
    }
    
    public static int[] findSum(int[] arr, int n) {
        int[] res = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            int tmp = n - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (tmp - arr[j] == 0) {
                    res[0] = arr[i];
                    res[1] = arr[j];
                    return res;
                }
            }
        }
        return res;
    }
    
}
