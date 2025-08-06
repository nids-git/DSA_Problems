package com.example.dsa_problems.arrays.twopointer;

import static com.example.dsa_problems.arrays.DisplayArray.displayArray;

public class MoveZero {

    public static void moveZeros(int[] arr){
        int i = 0;

        for(int j=0;j<arr.length;j++){
            if(arr[j] != 0){
                arr[i] = arr[j];
                i++;
            }
        }

        while(i<arr.length){
            arr[i] = 0;
            i++;
        }
        displayArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {45,0,4,89,0,0,67,0};
        moveZeros(arr);
    }
}
