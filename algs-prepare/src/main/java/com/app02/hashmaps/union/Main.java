package com.app02.hashmaps.union;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    List list1 = Arrays.asList("A", "B", "C");
    List list2 = Arrays.asList("C", "D", "E");
    System.out.println(union(list1, list2));
    System.out.println(intersection(list1, list2));
  }

  public static List union(List list1, List list2) {
    Set set = new HashSet();
    set.addAll(list1);
    set.addAll(list2);
    return new ArrayList(set);
  }

  public static List intersection(List list1, List list2) {
    Set set = new HashSet();
    set.addAll(list1);
    set.retainAll(list2);
    return new ArrayList(set);
  }

}
