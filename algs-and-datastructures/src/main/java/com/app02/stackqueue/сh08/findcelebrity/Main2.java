/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh08.findcelebrity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asusadmin
 */
public class Main2 {

    public static void main(String[] args) {
        int[][] party = {{0, 1, 0, 1}, {0, 0, 0, 0}, {1, 1, 0, 0}, {0, 1, 0, 0}};
        int res = findCelebrity(party, 4);
        System.out.println(res);
    }

    public static int findCelebrity(int[][] party, int numPeople) {
        int n = party.length;
        List<Integer> list = new ArrayList(n);
        for (int i = 0; i < n; i++) {
            int[] line = party[i];
            boolean isCandidat = true;
            for (int j = 0; j < line.length; j++) {
                if (party[i][j] != 0) {
                    isCandidat = false;
                    break;
                }
            }
            if (isCandidat) {
                list.add(i);
            }
        }

        System.out.println(list);

        for (int value : list) {
            boolean isCelebrity = true;
            for (int i = 0; i < n; i++) {
                if (i != value) {
                    int[] data = party[i];
                    if (data[value] != 1) {
                        isCelebrity = false;
                        break;
                    }
                }
            }
            if (isCelebrity) {
                return value;
            }
        }

        return -1;
    }

}
