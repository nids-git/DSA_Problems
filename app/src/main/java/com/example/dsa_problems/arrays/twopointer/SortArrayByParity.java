package com.example.dsa_problems.arrays.twopointer;

import static com.example.dsa_problems.arrays.DisplayArray.displayArray;

/** Problem - LeetCode -905
 Given an integer array nums, move all the even integers
 at the beginning of the array followed by all the odd integers.
 Return any array that satisfies this condition.
**/

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums){
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            if((nums[left]%2)==0){
                left++;
            }else if((nums[right]%2) != 0){
                right--;
            }else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] result = sortArrayByParity(nums);
        displayArray(result);
    }

}
