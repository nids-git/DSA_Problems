package com.example.dsa_problems.arrays.twopointer;

public class RemoveDuplicate {

    public static void removeDuplicateFromSortedArray(int[] arr){
        int j=0;

        for(int i=1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        displayArray(arr, j+1);
    }

    public static void removeDuplicateFromUnsortedArray(int[] arr){
        int k=0;

        for(int i=0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<k;j++){
                if(arr[j] == arr[i]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                arr[k] = arr[i];
                k++;
            }
        }
        displayArray(arr, k);
    }

    public static void displayArray(int[] arr, int length){
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {23,56,78,78,80,91};
        removeDuplicateFromSortedArray(arr);
        removeDuplicateFromUnsortedArray(arr);
    }
}
