package com.string;

import java.util.Arrays;

public class StringMethods2 {
    public static void main(String[] args) {
        String address = "Lokmanya Tilak Marg and, Dhobi Talao and, Chhatrapati Shivaji Terminus Area and, Fort, Mumbai, Maharashtra";
        // replace, substring, indexof, split

        String replaceChar = address.replace('L', 'l');
        System.out.println(replaceChar);

        String replaceWord = address.replaceAll("and", "");
        System.out.println(replaceWord);

        String subString = address.substring(0, 20);
        System.out.println(subString);

        int indexOfChar = address.indexOf('M');
        System.out.println(indexOfChar);

        String splitString[] = address.split(",");
        System.out.println(Arrays.asList(splitString));

    }
}
