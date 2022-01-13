package com.app00.ch02.sort;

public class MergeSorter implements MySorter {

    @Override
    public void sort(int[] data) {
        merge(data);
    }

    private int[] merge(int[] data){
        if(data.length<=1){
            return data;
        }

        int[] left = new int[data.length/2];
        int[] right = new int[data.length-left.length];

        System.arraycopy(data, 0, left, 0, left.length);
        System.arraycopy(data, left.length, right, 0, right.length);

        left = merge(left);
        right = merge(right);

        merge(left, right, data);

        return data;
    }

    private void merge(int[] left, int[] right, int[] res){
        int index = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while(leftIndex<left.length && rightIndex<right.length){
            if(left[leftIndex]<right[rightIndex]){
                res[index++] = left[leftIndex++];
            } else {
                res[index++] = right[rightIndex++];
            }
        }
        System.arraycopy(left, leftIndex, res, index, left.length-leftIndex);
        System.arraycopy(right, rightIndex, res, index, right.length-rightIndex);
    }
}
