package com.bridgelabz;
import java.util.*;
public class BinarySearchWords {
    static int binarySearch(String[] arr, String key) {
        int li = 0;
        int hi = arr.length - 1;

        while(li <= hi) {

            int mi = (li + hi) / 2;

            int res = key.compareTo(arr[mi]);

            if (res == 0) {
                return mi;
            } else if (res > 0) {
                li = mi + 1;
            } else hi = mi - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array you want to store the words");
        int Length = sc.nextInt();

        String[] ar1 = new String[Length];

        System.out.println("Enter words for array");
        for (int i = 0; i < Length; i++) {
            ar1[i] = sc.next();
        }

        System.out.println("Sorted array is:");

        Arrays.sort(ar1);
        System.out.println(Arrays.toString(ar1));

        System.out.println("Enter the word want to search: ");
        String key = sc.next();

        int result = binarySearch(ar1, key);

        if (result == -1) {
            System.out.println("Element not present");
        } else System.out.println("Element found at index " + result);

    }
}

