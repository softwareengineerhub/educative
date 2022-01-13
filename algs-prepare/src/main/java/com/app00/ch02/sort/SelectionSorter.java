package com.app00.ch02.sort;

public class SelectionSorter implements MySorter {

    @Override
    public void sort(int[] data) {
        for(int i=0;i<data.length-1;i++){
            int min = data[i];
            int index = i;
            for(int j=i+1;j<data.length;j++){
                if(min>data[j]){
                    min = data[j];
                    index = j;
                }
            }
            if(min!=data[i]){
                swap(data, i, index);
            }
        }
    }
}
