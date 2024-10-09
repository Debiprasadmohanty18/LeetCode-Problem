/*
*/
package com.tanmay.LeetCodeEasyProblems;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(containsDuplicate(nums));
	}
	
	public static boolean containsDuplicate(int[] nums) {
/*		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(i == j)
				{
					continue;
				}
				else if (nums[i] == nums[j]) 
				{
					return true;
				}
			}
		}
        return false;  */
		
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i] == nums[i+1])
				return true;
		}
		return false;
    }

}
