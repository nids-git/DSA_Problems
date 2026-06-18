package com.example.dsa.arrays.sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i < n; i++){
            int smallest = arr[i];
            int j = i-1;
            while(j>=0 && smallest<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = smallest;
        }

        displayArray(arr);
    }

    public static void displayArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,45,67,10,30,20};
        insertionSort(arr);
    }
}
