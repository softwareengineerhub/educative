package com.app02.hashmaps.ch02;

import java.util.HashSet;
import java.util.Set;

public class IsDisjoint {

    public static void main(String[] args) {
        int[] arr1 = {9,4,3,1,-2,6,5,7};
        int[] arr2 = {7,10,8};
        boolean res = isDisjoint(arr1, arr2);
        System.out.println("res="+res);
    }

    public static boolean isDisjoint(int[] arr1,int[] arr2) {
        Set<Integer> set1 = new HashSet();
        for(int i: arr1){
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet();
        for(int i: arr2){
            set2.add(i);
        }

        set1.retainAll(set2);
        System.out.println("set1="+set1);
        System.out.println("set2="+set2);
        return set1.isEmpty();
    }

}
