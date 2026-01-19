package com.app03.concurr.ch09.bank.account.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MathContextMain {

    public static void main(String[] args) {
        /*
        In Java’s BigDecimal world,
        MathContext is basically a “rules package” for doing calculations
         — it tells BigDecimal how precise the result should be and how to round it if it can’t be represented exactly

        1. What it contains
        A MathContext has two main things:
        Precision → The total number of significant digits to keep (not decimal places, but total digits).
        Rounding mode → What to do if the exact result doesn’t fit into that many digits.
         */

        MathContext mc4 = new MathContext(4, RoundingMode.HALF_UP);
        /*
            Precision = 4 significant digits
            Rounding mode = “round to nearest, ties go up”
         */
        MathContext mc10 = new MathContext(10, RoundingMode.HALF_UP);
        MathContext mc4Down = new MathContext(4, RoundingMode.FLOOR);

        BigDecimal a = new BigDecimal("123.4567891", mc4);
        BigDecimal b = new BigDecimal("123.4567891", mc10);
        BigDecimal c = new BigDecimal("123.4567891", mc4Down);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

        /*
        3. Why it’s useful
        Without MathContext, BigDecimal tries to keep all precision, which:
        Is slower
        Can lead to ArithmeticException for divisions (because the result is infinite decimal)
        MathContext:
        Prevents runaway precision
        Makes sure results are consistent with your domain rules (like financial rounding)
         */
    }

}
