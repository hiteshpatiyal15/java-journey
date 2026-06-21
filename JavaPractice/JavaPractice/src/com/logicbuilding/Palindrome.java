package com.logicbuilding;

public class Palindrome {

    public static boolean palindrome(int num) {
        int temp = num;
        int result = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num = num / 10;
        }
        return temp == result;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(11211));

    }
}