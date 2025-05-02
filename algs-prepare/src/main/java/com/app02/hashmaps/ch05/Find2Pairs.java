package com.app02.hashmaps.ch05;

import java.util.*;

public class Find2Pairs {

  public static void main(String[] args) {
    int[] nums = {3, 4, 7, 1, 12, 9};
    List<int[]> res = findPairs(nums);
    for (int[] item : res) {
      System.out.println(Arrays.toString(item));
    }
  }

  public static List<int[]> findPairs(int[] nums) {
    //int[][] res = new int[][];
    List<int[]> list = new ArrayList<>();
    Map<Integer, int[]> map = new HashMap<>();
    for (int i = 0; i < nums.length-1; i++) {
      int a = nums[i];
      for (int j = i+1; j < nums.length; j++) {
        int b = nums[j];
        int sum = a+b;
        if(map.containsKey(sum)){
          int[] arr1 = map.get(sum);
          list.add(arr1);
          list.add(new int[]{a, b});
        } else {
          map.put(sum, new int[]{a,b});
        }
      }
    }
    return list;
  }

}
