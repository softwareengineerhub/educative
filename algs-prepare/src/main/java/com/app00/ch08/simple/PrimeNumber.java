package com.app00.ch08.simple;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {
        int value = 1212;
        List<Integer> list = findPrimeNumber(value);
        for (int i : list) {
            System.out.println(i);
        }
    }

    private static List<Integer> findPrimeNumber(int value) {
        List<Integer> result = new ArrayList<>();
        while (value % 2 == 0) {
            result.add(2);
            value = value / 2;
        }

        for (int i = 3; i <= Math.sqrt(value); i += 2) {
            while (value % i == 0) {
                result.add(i);
                value = value / i;
            }
        }

        if (value > 2) {
            result.add(value);
        }

        return result;
    }


}
