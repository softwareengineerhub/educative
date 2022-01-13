package com.app00.ch02.sort;

public interface MySorter {

    public void sort(int[] data);

    default void swap(int[] data, int i, int j){
        data[i] = data[i]+data[j];
        data[j] = data[i]-data[j];
        data[i] = data[i]-data[j];
    }
}
