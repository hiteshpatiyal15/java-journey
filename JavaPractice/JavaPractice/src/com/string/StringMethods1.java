package com.string;

public class StringMethods1 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "Hello";
        String str = "  Strings Method  ";
        int num = 123;
        // String == operator
        System.out.println(a == b); // address comparision

        // String length
        System.out.println(a.length());

        // String trim
        System.out.println(str.trim()); // remove whitespace from start and end of string

        // String CharAt
        System.out.println(a.charAt(3)); // access charcter at given index

        // String toTowerCase and toUpperCase
        System.out.println(a.toLowerCase() + " " + a.toUpperCase()); // new string in lower and upper case

        // String contains
        System.out.println(a.contains(b)); // check sequence of character is present in another string

        // Steing equals and equalsIgnoreCase
        System.out.println(a.equals(b)); // value comaparision with case sensitive
        System.out.println(a.equalsIgnoreCase(b)); // value comparision with case insensitive

        // String concate
        System.out.println(a.concat(str)); // joining two or more strings together
        System.out.println(a + b); // joining two or more strings together. joins other premitive and nonpremitive
                                   // data

        // String isEmpty
        System.out.println(a.isEmpty()); // Returns true only if the string has a length of 0

        // String isBlank
        System.out.println(a.isBlank()); // Returns true if the string is empty or contains only whitespace

        String newStr = num + "";
        System.out.println(newStr);
    }
}
