package com.example.dsa.arrays.sorting;

/**
 *  In Bubble Sort, we compare adjacent element and after each pass
 *  largest element is placed to it correct position.
 */

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i < n-1; i++){
            boolean swap = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }

        displayArray(arr);
    }

    public static void displayArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,45,67,10,30,20};
        bubbleSort(arr);
    }
}
