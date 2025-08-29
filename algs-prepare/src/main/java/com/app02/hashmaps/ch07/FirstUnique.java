package com.app02.hashmaps.ch07;

import java.util.HashSet;
import java.util.Set;

public class FirstUnique {

  public static void main(String[] args) {
    int[] arr = {9, 2, 3, 2, 6, 6};
    int res = findFirstUnique(arr);
    System.out.println(res);
  }

  public static int findFirstUnique(int[] arr){
    Set<Integer> set = new HashSet<>();
    for(int i=0;i<arr.length;i++){
      if(set.contains(arr[i])){
        set.remove(arr[i]);
      } else {
        set.add(arr[i]);
      }
    }
    System.out.println("unique set="+set);

    for(int i=0;i<arr.length;i++){
      if(set.contains(arr[i])){
        return i;
      }
    }
    return -1;
  }

}
