package com.app01.arrays.ch01;

public class RemoveEven {


    int[] removeEven(int[] arr){
        int count = 0;
        for(int i: arr){
            if(i%2!=0){
                count++;
            }
        }
        int[] res = new int[count];
        int index = 0;
        for(int i=0;i<count;i++){
            if(arr[i]%2!=0){
                res[index++] = arr[i];
            }
        }
        return res;
    }


}
