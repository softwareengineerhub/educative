package com.app02.hashmaps.ch01;

import java.util.HashSet;
import java.util.Set;

public class IsSubset {

    static boolean isSubset(int arr1[], int arr2[]){
        Set<Integer> set = new HashSet();

        for(int i: arr1){
            set.add(i);
        }

        for(int i: arr2){
            if(!set.contains(i)){
                return false;
            }
        }

        return true;
    }

}
