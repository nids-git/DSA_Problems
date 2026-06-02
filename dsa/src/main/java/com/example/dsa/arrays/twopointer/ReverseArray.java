package com.example.dsa.arrays.twopointer;

// Two Pointer Approach
public class ReverseArray {
    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void displayArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,6,7,34,56};
        int[] a = reverseArray(arr);
        displayArray(a);
    }
}
