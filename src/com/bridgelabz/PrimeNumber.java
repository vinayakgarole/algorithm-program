package com.bridgelabz;

public class PrimeNumber {
    public static void main(String[] args) {

        int a = 0;
        int b = 1000;

        int temp = 0;

        System.out.println("Prime numbers are: ");

        for (int i = a; i <= b; i++) {

            if (i >= 2) {

                for (int n = 2; n <= i - 1; n++) {
                    if (i % n == 0) {
                        temp = temp + 1;
                    }
                }

                if (temp == 0) {
                    System.out.print(i + ", ");

                } else {
                    temp = 0;
                }
            }
        }
    }
}