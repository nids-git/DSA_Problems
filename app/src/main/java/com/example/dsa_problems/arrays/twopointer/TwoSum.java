package com.example.dsa_problems.arrays.twopointer;

import static com.example.dsa_problems.arrays.DisplayArray.displayArray;

/** Problem - LeetCode-1
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that
 * they add up to target.
 */
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] result = twoSum(nums, 9);
        displayArray(result);
    }
}