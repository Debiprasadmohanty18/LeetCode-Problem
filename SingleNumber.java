package com.tanmay.LeetCodeEasyProblems;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {2,6,2,3,4,3,4};
		System.out.println(singleNumber(nums));
		
	}

	public static int singleNumber(int[] nums) {
		
		int val = 0;
        for(int i=0;i<nums.length;i++)
        {
        	val = val^nums[i];
        }        
        return val;
    }
}
