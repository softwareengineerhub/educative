package com.app02.hashmaps.ch08;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveSame {

  public static void main(String[] args) {
    List list = new LinkedList();
    list.add("a");
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("a");
    System.out.println(list);
    removeDuplicatesWithHashing(list);
    System.out.println(list);
  }

  public static void removeDuplicatesWithHashing(List list) {
    Set set = new LinkedHashSet();
    set.addAll(list);
    list.clear();
    list.addAll(set);
  }

}
