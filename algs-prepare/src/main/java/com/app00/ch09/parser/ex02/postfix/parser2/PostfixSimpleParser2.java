package com.app00.ch09.parser.ex02.postfix.parser2;

import com.app00.ch09.parser.SimpleParser;

import java.util.Stack;

public class PostfixSimpleParser2 implements SimpleParser {

    @Override
    public double calculate(String text) {
        String postFix = createPostFix(text);
        return evaluatePostFix(postFix);
    }


    public String createPostFix(String text) {
        StringBuilder result = new StringBuilder();
        Stack<Character> operandStack = new Stack();
        String tmp = "";
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                //result.append(ch);
                tmp=tmp+ch;
            } else if (ch == '(') {
                operandStack.push(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (!tmp.isEmpty()) {
                    result.append(tmp);
                    result.append(" ");
                    tmp = "";
                }

                while(!operandStack.isEmpty()) {
                    char topAction = operandStack.pop();
                    if (topAction == '+' || topAction == '-' || topAction == '*' || topAction == '/') {
                        result.append(topAction);
                        result.append(" ");
                    }
                    if(topAction=='('){
                        break;
                    }
                }
                operandStack.push(ch);
            } else if(ch==')'){
                if (!tmp.isEmpty()) {
                    result.append(tmp);
                    result.append(" ");
                    tmp = "";
                }
                while(!operandStack.isEmpty()){
                    char action = operandStack.pop();
                    if(action=='('){
                        break;
                    }
                    result.append(action);
                    result.append(" ");
                }
            }
        }
        return result.toString().trim();
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
            } else {
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
        PostfixSimpleParser2 parser = new PostfixSimpleParser2();
        String source = "3+4*5";
        String postFix = parser.createPostFix(source);
        System.out.println("postFix=" + postFix);


        String text = "3 4 5 * +";
        double res = parser.evaluatePostFix(text);
        System.out.println("res=" + res);
    }

}
