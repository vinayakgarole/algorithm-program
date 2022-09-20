package com.bridgelabz;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st word: ");
        String s1 = sc.next();

        System.out.println("Enter the 2nd word: ");
        String s2 = sc.next();

        char[] c1 = s1.toCharArray();
        // char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toCharArray();
        // char[] c2 = s2.toLowerCase().toCharArray();

        if (c1.length == c2.length) {

            Arrays.sort(c1);
            Arrays.sort(c2);

            int temp = 0;

            for (int i = 0; i < c1.length; i++) {
                if (c1[i] != c2[i]) {
                    temp += 1;
                }
            }

            if (temp == 0) {

                System.out.println("The words are Anagram.");

            } else System.out.println("The words are not Anagram.");

        } else System.out.println("The words are not Anagram.");
    }
}
