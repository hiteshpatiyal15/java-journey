package com.logicbuilding;

import java.math.BigInteger;

public class FactorialOfNumber {
    public static BigInteger factorialNumber(int num) {
        // int result = 1;
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            // result = result * i;
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;

    }

    public static void main(String[] args) {
        int num = 50;
        System.out.println("Factorial of number '" + num + "' " + factorialNumber(num));
    }
}
