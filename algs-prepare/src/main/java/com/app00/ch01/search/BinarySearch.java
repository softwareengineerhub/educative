package com.app00.ch01.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] data = {0,1,2,3,4,5,6,7,8,9,10};
        int i=find(data, 1);
        System.out.println("i="+i);
    }

    public static int find(int[] data, int target){
        int left = 0;
        int right = data.length-1;
        int middle = -1;
        while(left<=right){
            middle = (left+right)/2;
            if(data[middle]==target){
                return middle;
            }
            if(data[middle]<target){
                left=middle+1;
            } else {
                right=middle-1;
            }
        }
        return -1;
    }

}
