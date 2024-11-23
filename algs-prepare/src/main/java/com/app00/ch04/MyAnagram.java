package com.app00.ch04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyAnagram {

    public static void main(String[] args) {
        String a = "eat";
        String b = "tea";
        boolean result = isAnagram(a,b);
        System.out.println("result="+result);
    }

    private static boolean isAnagram3(String a, String b){
        Map aMap = calcMapStream(a);
        Map bMap = calcMapStream(b);
        return aMap.equals(bMap);
    }

    private static Map<Character, Long> calcMapStream(String str){
        return str.chars().mapToObj(i->new Character((char)i)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static boolean isAnagram2(String a, String b){
        Map aMap = calcMap(a);
        Map bMap = calcMap(b);
        return aMap.equals(bMap);
    }

    private static Map<Character, Integer> calcMap(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for(char c: arr){
            if(!map.containsKey(c)){
                map.put(c, 0);
            }
            map.put(c, map.get(c)+1);
        }
        return map;
    }


    private static boolean isAnagram(String a, String b){
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1, b1);
    }

}
