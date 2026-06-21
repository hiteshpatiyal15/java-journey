package com.array;

public class JaggedArray {
    public static void main(String[] args) {
        int digit[][] = new int[2][];
        digit[0] = new int[5];
        digit[1] = new int[2];
        int count = 0;
        System.out.println("Initialize Jagged Array");
        for (int i = 0; i < digit.length; i++) {
            for (int j = 0; j < digit[i].length; j++) {
                digit[i][j] = count++;
            }
        }
        System.out.println("Output of jagged array");
        for (int i = 0; i < digit.length; i++) {
            for (int j = 0; j < digit[i].length; j++) {
                System.out.print(digit[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Initialize and output jagged array");
        int arr[][] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
