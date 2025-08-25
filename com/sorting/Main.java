// Java program to sort an array from smaller to bigger with insertion algorithm, where we compare second
// element with first, if needed swap them, them move to third element and compare it with first two, if needed
// swap them and so on till the end of array

package com.sorting;

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating an array to sort
        double [] arr = {2.0, 3.1, 1.2, 9.3, 4.5, 8.3};

        // Calling method sort for arr
        MyInsertionSort.sort(arr);

        // Printing sorted array to console
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println("]");
    }
}

// MyInsertionSort
class MyInsertionSort {

    // Method to sort an array
    public static void sort(double[] arr){
        int arr_length = arr.length;

        // Comparing all elements of array
        for (int i = 1; i < arr_length; i++) {
            double key = arr[i];
            int j = i - 1;

            // Moving elements that are greater to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}