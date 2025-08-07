package com.example.dsa_problems.arrays.twopointer;

import static com.example.dsa_problems.arrays.DisplayArray.displayArray;

public class ReverseArray {

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        displayArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {34,78,90,12,34};
        reverseArray(arr);
    }
}
