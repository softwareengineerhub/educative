package com.app02.hashmaps.ch03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SymmetricPairs {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}, {1, 6}};
        String res = findSymmetric(arr);
        System.out.println("res=" + res);
    }

    public static String findSymmetric(int[][] arr) {
        String result = "";
        Map<Integer, int[]> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            int[] tmp = arr[i];
            int sum = tmp[0] + tmp[1];
            if (map.containsKey(sum)) {
                result += Arrays.toString(tmp);
                result += Arrays.toString(map.get(sum));
            } else {
                map.put(sum, tmp);
            }
        }
        return result;
    }

}
