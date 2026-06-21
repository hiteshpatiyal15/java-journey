package com.logicbuilding;

public class FIndLengthOfLastWord {
    public static void main(String[] args) {
        String str = "Our Core Java programming";
        // method one
        String[] newStr = str.trim().split(" ");
        System.out.println(newStr[newStr.length - 1].length());

        // method two
        String a = str.trim();
        int len = 0;
        for (int i = a.length() - 1; i > 0; i--) {
            if (a.charAt(i) != ' ') {
                len++;
            } else {
                break;
            }
        }
        System.out.println(len);

    }
}
