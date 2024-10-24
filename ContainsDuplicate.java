/* Contains Duplicate :- 

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct. 

Example 1:
Input: nums = [1,2,3,1]
Output: true

Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false

Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

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