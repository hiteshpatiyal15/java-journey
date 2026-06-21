package com.logicbuilding;

public class EvenOdd {
    public static void evenOddNum(int num) {
        if ((num & 1) == 1) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }
    }

    public static void main(String[] args) {
        evenOddNum(43);
    }
}
