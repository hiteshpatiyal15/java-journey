package com.logicbuilding;

public class ReverseOfInteger {
    public static int reverse(int num) {
        int reverse = 0;
        int lastdigit = 0;
        while (num != 0) {
            lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int integer = 4827;
        System.out.println("Actual Integer: " + integer);
        System.out.println("Reverse Integer: " + reverse(integer));
    }
}
