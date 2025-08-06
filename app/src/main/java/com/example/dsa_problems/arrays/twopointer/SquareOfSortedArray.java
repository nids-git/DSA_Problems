package com.example.dsa_problems.arrays.twopointer;

/** Problem - Leetcode - 977
   Given an integer array nums sorted in non-decreasing order,
   return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquareOfSortedArray {
    public static int[] sortedSquares(int[] nums){
        int index = 0;
        for(int i=0;i<nums.length;i++){
            int sq = nums[i] * nums[i];
            nums[index++] = sq;
        }

        // sort the array
        for(int j=0;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                if(nums[j]>nums[k]){
                    int temp = nums[j];
                    nums[j] = nums[k];
                    nums[k]= temp;
                }
            }
        }
        return nums;
    }

    public static void displayArray(int[] nums){
       for(int i=0;i<nums.length;i++){
           System.out.print(nums[i]+", ");
       }
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] result = sortedSquares(arr);
        displayArray(result);
    }

}
