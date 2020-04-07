/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh08.findcelebrity;

import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class Main3 {

    public static void main(String[] args) {
        int[][] party = {{0, 1, 0, 1}, {0, 0, 0, 0}, {1, 1, 0, 0}, {0, 1, 0, 0}};
        int res = findCelebrity(party, 4);
        System.out.println(res);
    }

    public static int findCelebrity(int[][] party, int numPeople) {
        int n = party.length;
        Stack<Integer> stack = new Stack();
        for (int i = n - 1; i >= 0; i--) {
            stack.push(i);
        }

        while (numPeople > 1) {
            int i = stack.pop();
            int j = stack.pop();
            if (party[i][j] == 0) {
                stack.push(i);
            }
            if (party[j][i] == 0) {
                stack.push(j);
            }
            numPeople--;
        }

        System.out.println(stack);
        if(stack.size()!=1){
            return -1;
        }
        return stack.pop();
    }

}
