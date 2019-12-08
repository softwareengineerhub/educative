/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.hashtable.сh05.findpairs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asusadmin
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 12, 9};
        String res = findPair(arr);
        System.out.println(res);
    }

    public static String findPair(int[] arr) {
        Map<Integer, int[]> map = new HashMap();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                int[] tmp = new int[]{arr[i], arr[j]};
                if (map.containsKey(sum)) {
                    return Arrays.toString(tmp) + " ; " + Arrays.toString(map.get(sum));
                }
                map.put(sum, tmp);
            }
        }
        return "";
    }

}
