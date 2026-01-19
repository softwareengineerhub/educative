package com.app00.ch01.search;

public class LinearSearch {


    public int find2(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int find(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (target == data[i]) {
                return i;
            }
        }
        return -1;
    }

}
