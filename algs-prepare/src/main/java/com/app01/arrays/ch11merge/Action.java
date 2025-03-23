package com.app01.arrays.ch11merge;

public class Action {


    //
    public void merge(int[] left, int[] right, int m) {
        int leftIndex = left.length-1-m;
        int rightIndex = right.length-1;
        int index = left.length-1;
        while (leftIndex >=0 && rightIndex >= 0) {
            if(left[leftIndex]>right[rightIndex]){
                left[index] = left[leftIndex];
                leftIndex--;
            } else {
                left[index] = right[rightIndex];
                rightIndex--;
            }
            index--;
        }
    }

}
