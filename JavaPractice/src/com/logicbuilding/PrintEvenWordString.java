package com.logicbuilding;

public class PrintEvenWordString {

    public static void main(String[] args) {
        String java = "Java is a high-level, object-oriented programming language used to build web apps, mobile applications, and enterprise software systems";
        String words[] = java.split(" ");
        for (String word : words) {
            int size = word.length();
            if (size % 2 == 0) {
                System.out.println(word + " " + "Length=" + size);
            }
        }
    }
}
