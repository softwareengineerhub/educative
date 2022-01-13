package com.app04.stack.ch00;

import java.util.Stack;

public class CheckStringIsBalanced {

    public static void main(String[] args) {
        //String s = "<<<<<<<<<<<<>>>>>>>>><<>>>>><<<<<<<<<<><<<<<<>>>>>>>>>>>>>>>";
        String s = "<><>>";
        boolean res = isBalanced(s);
        System.out.println("res="+res);
    }

    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        char[] data = s.toCharArray();
        for(char c: data){
            if('<'==c) {
                stack.push(c);
            } else {
                if(!stack.isEmpty()){
                    char lastItem = stack.pop();
                } else {
                    return false;
                }

            }
        }
        return true;
    }


}
