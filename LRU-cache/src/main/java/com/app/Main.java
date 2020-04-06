package com.app;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        //3112
        int[] data = {3,1,1,2};
        System.out.println(Arrays.toString(data));
        data = getNext(data);
        System.out.println(Arrays.toString(data));
    }

    public static int[] getNext(int[] input){
        Map<Integer, Integer> partitions = groupBy(input);
        int[] res = new int[partitions.size()*2];
        int i=0;
        for(int key: partitions.keySet()){
            res[i++] = partitions.get(key);
            res[i++] = key;

        }
        return res;
    }


    private static Map<Integer, Integer> groupBy(int[] data){
        Map<Integer, Integer> map = new LinkedHashMap();
        for(int i: data){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, 1+map.get(i));
            }
        }
        return map;
    }


}
