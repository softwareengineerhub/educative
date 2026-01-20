package com.app00.ch09.parser.ex01.recursive;

import com.app00.ch09.parser.SimpleParser;

public class RecursiveSimpleParser implements SimpleParser {

    @Override
    public double calculate(String text) {
        text = text.trim();
        validate(text);
        int position = -1;
        if ((position = findLastPositionOfDelimiter(text, '+')) != -1) {
            String left = getLeftPart(text, position);
            String right = getRightPart(text, position);
            double a = calculate(left);
            double b = calculate(right);
            return a + b;
        }
        if ((position = findLastPositionOfDelimiter(text, '-')) != -1) {
            String left = getLeftPart(text, position);
            String right = getRightPart(text, position);
            double a = calculate(left);
            double b = calculate(right);
            return a - b;
        }

        if ((position = findLastPositionOfDelimiter(text, '*')) != -1) {
            String left = getLeftPart(text, position);
            String right = getRightPart(text, position);
            return calculate(left) * calculate(right);
        }
        if ((position = findLastPositionOfDelimiter(text, '/')) != -1) {
            String left = getLeftPart(text, position);
            String right = getRightPart(text, position);
            return calculate(left) / calculate(right);
        }
        if (text.startsWith("(") && text.endsWith(")")) {
            text = text.substring(1, text.length() - 1);
            return calculate(text);
        }
        /*if(text.isEmpty()){
            return 0;
        }*/
        return Double.parseDouble(text);
    }

    private int findLastPositionOfDelimiter(String text, char target) {
        int count = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == '(') {
                count++;
            } else if (text.charAt(i) == ')') {
                count--;
            } else if (text.charAt(i) == target) {
                if (count == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    private void validate(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("text is empty or null");
        }
        if (!Character.isDigit(text.charAt(0)) && text.charAt(0) != '(' && text.charAt(0) != '-') {
            throw new IllegalArgumentException("text must start with digit");
        }
    }

    private String getLeftPart(String text, int position) {
        return text.substring(0, position);
    }

    private String getRightPart(String text, int position) {
        return text.substring(position + 1, text.length());
    }


}
