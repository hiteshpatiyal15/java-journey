package com.logicbuilding;

import java.util.HashSet;
import java.util.Set;

public class Panagram2 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dogg";
        // boolean result = checkPanagram(sentence);
        boolean result = checkPanagram1(sentence);
        if (result) {
            System.out.println("Its panagram");
        } else {
            System.out.println("Not a panagram");
        }
    }

    private static boolean checkPanagram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        Set<Character> set = new HashSet<Character>();
        char[] input = sentence.toLowerCase().toCharArray();
        for (char c : input) {
            if (Character.isLetter(c)) {
                set.add(c);
            }
        }
        if (set.size() == 26) {
            return true;
        }
        return false;
    }

    // Another solution using array
    public static boolean checkPanagram1(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        HashSet<Character> set = new HashSet<Character>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c == ' ') {
                continue;
            }
            set.add(c);
        }
        if (set.size() == 26) {
            return true;
        }
        return false;
    }
}
