package com.bridgelabz;

public class Permutation {
    public static void print(String str, String permutation, int index) {
        if (str.length() == 0) {
            System.out.println(permutation);
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            print(newStr, permutation + currentChar, index + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        print(str, "", 0);
    }
}