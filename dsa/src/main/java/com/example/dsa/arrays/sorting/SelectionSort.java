package com.example.dsa.arrays.sorting;

/**
 * In Selection Sort -
 * In each iteration, it selects the minimum element
 * from the unsorted part and swaps it with the first unsorted element.
 * After every pass, one element is placed in its correct sorted position.
 */
public class SelectionSort {

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i < n-1; i++){
            int smallest = i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest]=temp;
        }

        displayArray(arr);
    }

    public static void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,45,67,10,30,20};
        selectionSort(arr);
    }
}
