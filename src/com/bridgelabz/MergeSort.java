package com.bridgelabz;

public class MergeSort {
    void merge(int arr[], int l, int m, int r)
    {
        int num1 = m - l + 1;
        int num2 = r - m;

        int L[] = new int[num1];
        int R[] = new int[num2];

        // Copies value to temp arrays
        for (int i = 0; i < num1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < num2; ++j)
            R[j] = arr[m + 1 + j];

        // Initial indexes of first and second sub arrays
        int i = 0, j = 0;

        // Initial index of merged array
        int k = l;
        while (i < num1 && j < num2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < num1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < num2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 88, 5, 27, 46, 39, 58, 72 };

        System.out.println("Given Array:");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\n Sorted Array:");
        printArray(arr);
    }
}

