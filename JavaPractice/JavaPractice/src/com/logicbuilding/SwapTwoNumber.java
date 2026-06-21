package com.logicbuilding;

public class SwapTwoNumber {

    public static void swapTwoNumWithBitwise(int num1, int num2) {
        System.out.println("Before Swapping: " + num1 + " " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After Swapping: " + num1 + " " + num2);
    }

    public static void swapTwoNumWithTempVar(int num1, int num2) {
        int temp = 0;
        System.out.println("Before Swapping: " + num1 + " " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping: " + num1 + " " + num2);
    }

    public static void swapTwoNumWithMathOperator(int num1, int num2)
    // 10, 20
    {
        System.out.println("Before swapping: " + num1 + " " + num2);
        num1 = num1 + num2; // 30
        num2 = num1 - num2; // 30-20=10
        num1 = num1 - num2; // 30-10 = 20
        System.out.println("After Swapping: " + num1 + " " + num2);

    }

    public static void main(String[] args) {
        System.out.println("Swap two number using bit wise operator");
        swapTwoNumWithBitwise(10, 37);
        System.out.println("------------------------------------------");
        System.out.println("Swap two number using tempraroy variable");
        swapTwoNumWithTempVar(12, 97);
        System.out.println("------------------------------------------");
        System.out.println("Swap two number using maths operation");
        swapTwoNumWithMathOperator(39, 63);
    }
}
