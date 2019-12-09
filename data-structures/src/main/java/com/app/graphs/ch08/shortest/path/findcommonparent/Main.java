/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.graphs.ch08.shortest.path.findcommonparent;

/**
 *
 * @author Dprokopiuk
 */
public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 3};
        int[] b = new int[]{0, 1, 2, 5};
        int n = Math.min(a.length, b.length);
        int lastCommonIndex = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                break;
            }
            lastCommonIndex = i;
        }
        if (lastCommonIndex != -1) {
            System.out.println(a[lastCommonIndex]);
        } else {
            System.out.println("No common items");
        }

    }

}
