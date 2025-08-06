package com.example.dsa_problems.arrays.twopointer;

import static com.example.dsa_problems.arrays.DisplayArray.displayArray;

/** Problem - Leetcode - 922
 * Given an array of integers nums,
 * half of the integers in nums are odd, and the other half are even.
 * Sort the array so that whenever nums[i] is odd,
 * i is odd, and whenever nums[i] is even, i is even.
 */
public class SortArrayByParity2 {
    public static int[] sortArrayByParityII(int[] nums) {
        int left = 0;
        int right = 1;

        while(left<nums.length && right<nums.length){
            if((nums[left]%2) == 0){
                left = left+2;
            }else if((nums[right]%2) != 0){
                right = right+2;
            } else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left = left+2;
                right = right+2;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        int[] result = sortArrayByParityII(arr);
        displayArray(result);

    }
}
