package com.app01.arrays.ch04;

import java.util.Arrays;

public class ProductsArray {

    public static void main(String[] args) {
        int[] data = {1,2,3,4};
       // int[] data = {4,2,1,5,0};
        int[] res = findProduct2(data);
        System.out.println(Arrays.toString(res));
    }



    static int[] findProduct2(int[] arr) {
        int[] res = new int[arr.length];
        int countZero = 0;
        int zeroIndex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroIndex=i;
                countZero++;
                if(countZero==2){
                    return res;
                }
            }
        }

        System.out.println("countZero="+countZero);
        System.out.println("zeroIndex="+zeroIndex);

        int p = 1;
        for(int i=0;i<arr.length;i++){
            if(i!=zeroIndex){
                p = p*arr[i];
            }
        }
        if(zeroIndex!=-1){
            res[zeroIndex] = p;
            return res;
        }
        for(int i=0;i<arr.length;i++){
            res[i] = p/arr[i];
        }
        return res;
    }




    static int[] findProduct(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int p = 1;
            for (int j = 0; j < arr.length; j++) {
                if(i!=j){
                    if(arr[j]==0){
                        p = 0;
                        break;
                    } else {
                        p = p * arr[j];
                    }
                }
            }
            res[i] = p;
        }
        return res;
    }

}
