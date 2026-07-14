package com.logicbuilding;

public class Panagram1 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        if (checkPanagam(sentence)) {
            System.out.println("Is Panagram");
        } else {
            System.out.println("Not panagram");
        }
    }

    private static boolean checkPanagam(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
}
