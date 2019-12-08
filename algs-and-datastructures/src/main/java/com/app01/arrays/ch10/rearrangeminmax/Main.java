/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app01.arrays.ch10.rearrangeminmax;

import java.util.Arrays;

/**
 *
 * @author asusadmin
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        maxMin(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void maxMin(int[] arr) {
        int[] tmp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            tmp[j++] = arr[arr.length - 1 - i];
            tmp[j++] = arr[i];
        }
        System.out.println(Arrays.toString(tmp));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmp[i];
        }
    }

}
