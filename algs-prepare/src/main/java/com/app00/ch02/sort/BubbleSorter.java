package com.app00.ch02.sort;

public class BubbleSorter implements MySorter {

    @Override
    public void sort(int[] data) {
        for(int i=0;i<data.length-1;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[j]<data[i]){
                    swap(data, i, j);
                }
            }
        }
    }
}
