package com.app03.concurr.ch09.bank.account.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainRounding {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("123.4567891").setScale(2, RoundingMode.DOWN);
        System.out.println(a);
    }

}
