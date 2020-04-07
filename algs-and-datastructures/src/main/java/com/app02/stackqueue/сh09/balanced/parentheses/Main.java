/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app02.stackqueue.сh09.balanced.parentheses;

import java.util.Stack;

/**
 *
 * @author asusadmin
 */
public class Main {

    public static void main(String[] args) {
        String exp = "{[({})]}";
        String exp2 = "{([](}";
        System.out.println(isBalanced(exp));
        System.out.println(isBalanced(exp2));
    }

    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack();

        for (char ch : exp.toCharArray()) {
            if (ch == '}' || ch == ')' || ch == ']') {
                char top = stack.peek();
                if ((top == '{' && ch!='}') || (top == '(' && ch!=')') || (top == '[' && ch!=']')) {
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

}
