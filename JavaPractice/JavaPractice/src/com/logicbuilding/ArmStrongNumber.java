package com.logicbuilding;

public class ArmStrongNumber {

    public static boolean isArmStrongNumber(int num) {
        int copyNum = num;
        int lastDigit = 0;
        int armStrongNum = 0;
        int digits = 0;

        while (copyNum != 0) {
            digits++;
            copyNum /= 10;
        }

        copyNum = num;

        while (copyNum != 0) {
            lastDigit = copyNum % 10;
            armStrongNum = armStrongNum + multiplyOfNumer(lastDigit, digits);
            copyNum = copyNum / 10;
        }
        return armStrongNum > 0 && armStrongNum == num;
    }

    static int multiplyOfNumer(int base, int power) {
        int result = 1;
        while (power != 0) {
            result *= base;
            power--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Is Armstrong Number: " + isArmStrongNumber(153));
    }
}
