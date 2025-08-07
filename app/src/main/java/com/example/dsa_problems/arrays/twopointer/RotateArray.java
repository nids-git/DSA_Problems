package com.example.dsa_problems.arrays.twopointer;

import static com.example.dsa_problems.arrays.DisplayArray.displayArray;

/** Problem - LeetCode -189
 * Given an integer array nums, rotate the array
 * to the right by k steps, where k is non-negative.
 */
public class RotateArray {

    public static void rotateArray(int[] nums, int k){
        k = k%nums.length;
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);

        displayArray(nums);
    }
    public static void reverseArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateArray(arr, 3);

    }
}
