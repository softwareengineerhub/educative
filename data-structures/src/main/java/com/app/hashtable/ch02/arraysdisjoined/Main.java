/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.hashtable.ch02.arraysdisjoined;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DProkopiuk
 */
public class Main {

    public static void main(String[] args) {
        int[] array1 = {9, 4, 3, 1, -2, 6, 5};
        int[] array2 = {7, 10, 8};
        System.out.println(isDisjoined(array1, array2));
    }

    private static boolean isDisjoined(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet();

        for (int i = 0; i < array1.length; i++) {
            set.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            if (set.contains(array2[i])) {
                return false;
            }
        }

        return true;
    }

}
