package com.logicbuilding;

public class StarPattern {
    /*
    *
    **
    ***
    ****
    *****
    */
    public static void fiveStartPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramidPattern(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // fiveStartPattern();
        pyramidPattern(5);
    }

}
