package com.example.dsa.arrays.twopointer;

// Two Pointers Approach
public class MoveZeros {

    public static int[] moveZero(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        while(j<arr.length){
            arr[j] = 0;
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,0,9,0,4,0,34,0,56,98};
        int[] ar = moveZero(arr);
        displayArray(ar);
    }
}
