package com.app03.concurr.ch09.bank.account.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ScaleMain {

    public static void main(String[] args) {
        /*
        setScale() says “Force exactly N digits after the decimal.”
         */
        BigDecimal a = new BigDecimal("123.45");
        BigDecimal b = new BigDecimal("123.45");
        BigDecimal result2 = a.add(b).setScale(2);
        BigDecimal result3 = a.add(b).setScale(3);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("result2=" + result2);// 246.90
        System.out.println("result3=" + result3);// 246.900

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
