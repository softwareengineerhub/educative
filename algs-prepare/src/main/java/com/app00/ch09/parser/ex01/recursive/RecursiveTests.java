package com.app00.ch09.parser.ex01.recursive;

import com.app00.ch09.parser.SimpleParser;

import java.util.LinkedHashMap;
import java.util.Map;

public class RecursiveTests {

    public static void main(String[] args) {
        SimpleParser simpleParser = new RecursiveSimpleParser();
        Map<String, Double> map = getTestData();
        for (String text : map.keySet()) {
            System.out.println(text);
            double result = simpleParser.calculate(text);
            boolean passed = result == map.get(text);
            System.out.println("\t" + passed);
            System.out.println("-------------------------");
        }

    }


    private static Map<String, Double> getTestData() {
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("2", 2.0);
        //map.put("1.2", 1.2);
        map.put("2+3", 5.0);
        map.put("1+2+3", 6.0);
        map.put("1+2*3", 7.0);
        map.put("6*2", 12.0);
        map.put("2*3+4", 10.0);
        map.put("3+4+5*6*2+1", 68.0);
        map.put("(1+2)+3", 6.0);
        map.put("1+(2+3)", 6.0);
        map.put("(4+1+2)*3", 21.0);
        map.put("5 * (((9+8) * (4*6)) + 7)", 2075.0);
        map.put("(3*4+16)/7", 4.0);
        map.put("(20-2)/3", 6.0);
        map.put("4*4+2", 18.0);
        map.put("35/7+3", 8.0);
        map.put("(3.5+3.6)*2.3", 16.33);
        map.put(" 4 * ( (4+3) * (3*2) + 3)", 180.0);
        map.put("3.1 + 4.5 * 5", 25.6);
        map.put("((4+5)*2)*(3+1)", 72.0);
        map.put("2*(3+5)", 16.0);
        map.put("(3+5)*2+(6-3)", 19.0);
        map.put("5/4*5", 6.25);
        map.put("(5+8)-5+3", 11.0);

        map.put("5+8-5+3", 11.0);
        map.put("5+(8-5)+3", 11.0);
        map.put("5+8-(5+3)", 5.0);
        map.put("(10*2)/5*4", 16.0);
        map.put("(8-5)+5-3", 5.0);
        map.put("5*8/5-2", 6.0);
        map.put("(5+3)-5+3", 6.0);
        return map;
    }


}
