package com.string;

public class Stringclass1 {
    public static void main(String[] args) {
        String student1 = "Arun";
        String student2 = "arun";
        System.out.println(student1 == student2); // reference compare
        System.out.println(student1.equals(student2)); // value compare with case sensitive
        System.out.println(student1.equalsIgnoreCase(student2)); // value compare with case insensitive
    }
}
