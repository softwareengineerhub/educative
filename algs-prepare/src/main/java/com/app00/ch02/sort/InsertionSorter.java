package com.app00.ch02.sort;

public class InsertionSorter implements MySorter {

    @Override
    public void sort(int[] data) {
        for(int i=0;i<data.length;i++){
            int k=i;
            while(k>0 && data[k]<data[k-1]){
                swap(data, k, k-1);
                k--;
            }
        }
    }

}
