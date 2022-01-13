package com.app00.ch02.sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = {0,4,7,1,3,2,5,9,8};
        MySorter mySorter = getSorter(3);
        mySorter.sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static MySorter getSorter(int type){
        switch (type){
            case 0:
                return new SelectionSorter();
            case 1:
                return new InsertionSorter();
            case 2:
                return new BubbleSorter();
            case 3:
                return new MergeSorter();
            default: throw new RuntimeException("Incorrect type="+type);
        }
    }

}
