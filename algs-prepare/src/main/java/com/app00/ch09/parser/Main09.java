package com.app00.ch09.parser;

import com.app00.ch09.parser.ex01.recursive.RecursiveSimpleParser;

public class Main09 {

    public static void main(String[] args) {
        SimpleParser simpleParser = getParser(0);

        String text = "3+4*5";//23
        double result = simpleParser.calculate(text);
        System.out.println("result=" + result);

        String text2 = "(3+5)*2+(6-3)";//19
        double result2 = simpleParser.calculate(text2);
        System.out.println("result2=" + result2);


    }

    private static SimpleParser getParser(int type) {
        switch (type) {
            case 0:
                return new RecursiveSimpleParser();
            default:
                return new RecursiveSimpleParser();

        }
    }
}
