package com.app00.ch09.parser.ex02.postfix.parser1;

import com.app00.ch09.parser.SimpleParser;
import com.app00.ch09.parser.ex02.postfix.parser2.PostfixSimpleParser2;

import java.util.Stack;

public class PostfixSimpleParser1 implements SimpleParser {

    @Override
    public double calculate(String text) {
        String postFix = createPostFix(text);
        return evaluatePostFix(postFix);
    }


    public String createPostFix(String text) {
        StringBuilder result = new StringBuilder();
        Stack<Character> operandStack = new Stack();
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                result.append(ch + " ");
            } else if (ch == '(') {
                operandStack.push(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operandStack.isEmpty()) {
                    char topOperator = operandStack.peek();
                    if (operatorHasSameOrHigherPriority(ch, topOperator)) {
                        result.append(topOperator + " ");
                        operandStack.pop();
                    } else {
                        break;
                    }
                }
                operandStack.push(ch);
            } else if (ch == ')') {

                while (!operandStack.isEmpty()) {
                    char topOperator = operandStack.pop();
                    if (topOperator == '(') {
                        break;
                    }
                    result.append(topOperator + " ");
                }
            }
        }

        while (!operandStack.isEmpty()) {
            char topAction = operandStack.pop();
            if (topAction != '(') {
                result.append(topAction + " ");
            }
        }

        return result.toString().trim();
    }

    private boolean operatorHasSameOrHigherPriority(char a, char b) {
        if (a == '+' || a == '-') {
            return a == '+' || a == '-' || a == '*' || a == '/';
        }
        if (a == '*' || a == '/') {
            return b == '*' || b == '/';
        }
        return false;
    }

    public double evaluatePostFix(String text) {
        String[] data = text.split(" ");
        Stack<Double> stack = new Stack<>();
        for (String item : data) {
            if ("+".equals(item) || "-".equals(item) || "*".equals(item) || "/".equals(item)) {
                double right = stack.pop();
                double left = stack.pop();
                double result = getResult(item, left, right);
                stack.push(result);
            } else if (!item.equals("(")) {
                stack.push(Double.parseDouble(item));
            }
        }
        if (stack.size() != 1) {
            throw new IllegalStateException("Stack size should be 1. Stack=" + stack);
        }
        return stack.pop();
    }

    private double getResult(String action, double left, double right) {
        if ("+".equals(action)) {
            return left + right;
        }
        if ("-".equals(action)) {
            return left - right;
        }
        if ("*".equals(action)) {
            return left * right;
        }
        if ("/".equals(action)) {
            return left / right;
        }
        throw new IllegalStateException("Action is incorrect=" + action);
    }

    public static void main2(String[] args) {
        PostfixSimpleParser2 parser = new PostfixSimpleParser2();
        String source = "(3+5)*2+(6-3)";
        String postFix = parser.createPostFix(source);
        System.out.println("postFix=" + postFix);


        String text = "3 5 + 2 * 6 3 - +";
        double res = parser.evaluatePostFix(text);
        System.out.println("res=" + res);
    }


    public static void main(String[] args) {
        PostfixSimpleParser1 parser = new PostfixSimpleParser1();
        String source = "3+4*5";
        String postFix = parser.createPostFix(source);
        System.out.println("postFix=" + postFix);


        String text = "3 4 5 * +";
        double res = parser.evaluatePostFix(text);
        System.out.println("res=" + res);
    }

}
