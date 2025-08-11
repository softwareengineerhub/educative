package com.app01.arrays.ch11merge;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        Action action = new Action();
        int[] left = {1, 2, 3, 0, 0, 0};
        int[] right = {2, 5, 6};
        int m = 3;
        action.merge(left, right, m);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.equals(left, new int[]{1, 2, 2, 3, 5, 6}));
        System.out.println("------------------------");


        left = new int[]{1};
        right = new int[]{};
        m = 1;
        action.merge(left, right, m);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.equals(left, new int[]{1}));
        System.out.println("------------------------");


        left = new int[]{0};
        right = new int[]{1};
        m = 0;
        action.merge(left, right, m);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.equals(left, new int[]{1}));
        System.out.println("------------------------");


        left = new int[]{1, 8, 9, 10, 0, 0, 0, 0, 0};
        right = new int[]{2, 3, 4, 5, 6};
        m = 5;
        action.merge(left, right, m);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.equals(left, new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10}));
        System.out.println("------------------------");


        left = new int[]{1, 8, 9, 10, 11, 0, 0, 0, 0, 0};
        right = new int[]{2, 3, 4, 5, 6};
        m = 5;
        action.merge(left, right, m);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.equals(left, new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10, 11}));


        System.out.println("------------------------");
        left = new int[]{8, 9, 10, 11, 0, 0, 0, 0, 0};
        right = new int[]{2, 3, 4, 5, 6};
        m = 5;
        action.merge(left, right, m);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.equals(left, new int[]{2, 3, 4, 5, 6, 8, 9, 10, 11}));


        System.out.println("------------------------");
        left = new int[]{2, 3, 4, 5, 6,0,0,0,0};
        right = new int[]{8, 9, 10, 11};
        m = 4;
        action.merge(left, right, m);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.equals(left, new int[]{2, 3, 4, 5, 6, 8, 9, 10, 11}));
    }

}
