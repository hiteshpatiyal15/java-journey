package com.logicbuilding;

public class ArmStrongNumber {

    public static boolean isArmStrongNumber(int num) {
        int copyNum = num;
        int lastDigit = 0;
        int armStrongNum = 0;
        while (copyNum != 0) {
            lastDigit = copyNum % 10;
            armStrongNum = armStrongNum + (lastDigit * lastDigit * lastDigit);
            copyNum = copyNum / 10;
        }
        return copyNum > 0 && copyNum == num;
    }

    public static void main(String[] args) {
        System.out.println("Is Armstrong Number: " + isArmStrongNumber(153));
    }
}
