package com.app03.concurr.ch09.bank.account.bigdecimal;

import java.math.BigDecimal;

public class NumbersSolutionBigDecimalMain {

    public static void main(String[] args) {
        /*
        1. The problem with double
            double in Java is a binary floating-point type (IEEE 754).
            It stores numbers in binary (base-2), not decimal (base-10).
            Many decimal fractions cannot be represented exactly in binary — just like 1/3 can’t be exactly represented in decimal.
         */
        System.out.println(0.1+0.2);//prints 0.30000000000000004

        /*
        2. How BigDecimal fixes this
            BigDecimal:
            Stores numbers in base-10 exactly.
            Lets you control precision and rounding rules.
            Avoids accumulation of floating-point errors.
         */
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        System.out.println(a.add(b)); // 0.3 exactly

        //Avoid creating BigDecimal from double — that copies its imprecision:
        BigDecimal sampleBad = new BigDecimal(0.1); // bad
        BigDecimal sampleGood = new BigDecimal("0.1"); // good
        System.out.println("sampleBad="+sampleBad);
        System.out.println("sampleGood="+sampleGood);

    }

}

