/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app03.hashtable.сh03.array.symmetricpairs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asusadmin
 */
public class Main {

    public static void main(String args[]) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}};
        String symmetric = findSymmetric(arr);
        System.out.println(symmetric);
    }

    public static String findSymmetric(int[][] arr) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            Integer other = map.get(b);
            if (other != null) {
                if (a == other) {
                    sb.append(Arrays.toString(arr[i]));
                }
            }
            map.put(a, b);
        }
        return sb.toString();
    }

}
