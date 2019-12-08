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
public class Main02SortingBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int[] res = findSum(arr, 27);
        System.out.println(Arrays.toString(res));        
    }

    public static int[] findSum(int[] arr, int n) {
        int[] res = new int[2];
        Arrays.sort(arr);
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            int sum = arr[startIndex] + arr[endIndex];
            if (sum == n) {
                res[0] = arr[startIndex];
                res[1] = arr[endIndex];
                return res;
            }
            if (sum < n) {
                startIndex++;
            } else {
                endIndex--;
            }
        }

        return res;
    }

}
