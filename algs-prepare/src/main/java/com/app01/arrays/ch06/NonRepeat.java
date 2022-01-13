package com.app01.arrays.ch06;

public class NonRepeat {

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 6, 6};
        int res = findFirstUnique(arr);
        System.out.println(res);
    }

    static int findFirstUnique(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean hasSame = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    hasSame=true;
                    break;
                }
            }
            if(!hasSame){
                return arr[i];
            }
        }
        return -1;
    }

}
