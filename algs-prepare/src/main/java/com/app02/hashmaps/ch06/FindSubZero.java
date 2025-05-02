package com.app02.hashmaps.ch06;

import java.util.HashMap;
import java.util.Map;

public class FindSubZero {

  public static void main(String[] args) {
    int[] arr = {6, 4, -7, 3, 12, 9};
    boolean res = findSubZero(arr);
    System.out.println(res);
  }

  public static boolean findSubZero(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (arr[i] == 0 || sum == 0 || map.get(sum) != null) {
        return true;
      }
      map.put(sum, i);
    }
    return false;
  }

}
