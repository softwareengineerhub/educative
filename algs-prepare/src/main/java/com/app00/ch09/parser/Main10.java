package com.app00.ch09.parser;

import com.app00.ch09.parser.ex01.recursive.RecursiveSimpleParser;
import com.app00.ch09.parser.ex02.postfix.parser2.PostfixSimpleParser2;

public class Main10 {

    public static void main(String[] args) {
        SimpleParser simpleParser = getParser(0);

        String text = "5+8-5+3";//11
        double result = simpleParser.calculate(text);
        System.out.println("result=" + result);
    }

    private static SimpleParser getParser(int type) {
        switch (type) {
            case 0:
                return new RecursiveSimpleParser();
            case 1:
                return new PostfixSimpleParser2();
            default:
                return new RecursiveSimpleParser();

        }
    }
}
