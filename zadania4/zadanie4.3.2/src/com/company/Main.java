package com.company;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("3000");
        BigDecimal b = new BigDecimal("0.2");
        BigDecimal c = new BigDecimal("4");
        BigDecimal y = new BigDecimal("100");
        System.out.println(a.multiply(b.divide(y)).multiply(c));
    }
}
