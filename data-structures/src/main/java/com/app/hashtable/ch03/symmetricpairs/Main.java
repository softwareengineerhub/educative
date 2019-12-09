/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.hashtable.ch03.symmetricpairs;

/**
 *
 * @author DProkopiuk
 */
public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}};
        findSymmetrciPairs(arr);
    }

    private static void findSymmetrciPairs(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            
            int[] data = arr[i];

            for (int j = i+1; j < arr.length; j++) {

                int[] tmp = arr[j];

                if (tmp.length == data.length) {
                    boolean isPair = true;
                    for (int k = 0; k < data.length; k++) {
                        if (data[k] != tmp[tmp.length - 1 - k]) {
                            isPair = false;
                            break;
                        }
                    }
                    if (isPair) {
                        System.out.println(i + " ; " + j + "->pair");
                    }
                }

            }

        }
    }

}
