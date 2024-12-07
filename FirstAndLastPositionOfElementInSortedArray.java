/* Find First and Last Position of Element in Sorted Array :-

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
 
*/

package com.tanmay.LeetCodeEasyProblems;

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {

	public static void main(String[] args) {
		
		int[] nums = {5,7,7,8,8,10};
		int target = 7;
		System.out.println(Arrays.toString(searchRange(nums, target)));
	}
	
	// Approach - 1 :- 
	static int[] searchRange(int[] nums, int target)
	{
		int[] ans = {-1, -1};
		
		ans[0] = givePosition(nums, target, true);
		ans[1] = givePosition(nums, target, false);
		
		return ans;		
	}
	
	static int givePosition(int[] nums, int target, Boolean check)
	{
		int retVal = -1;
		
		int st = 0;
		int end = nums.length-1;
		
		while(st <= end)
		{
			int mid = st + (end-st)/2;
			
			if(nums[mid] == target)
			{
				retVal = mid;
				if(check) 
					end = mid - 1;
				else
					st = mid + 1;
			}
			else if (nums[mid] > target)
				end = mid - 1;
			else
				st = mid + 1;
		}
		
		return retVal;
	}
	
	
	
	/* Approach - 2 :- 
	 
	static int[] searchRange(int[] nums, int target) 
	{
		int st = 0;
		int end = nums.length-1;
		
        int[] ans = {-1,-1};
        
        ans[0] = giveFirstOccurance(nums,target,st,end);
        ans[1] = giveLastOccurance(nums,target,st,end);
        
		return ans;             
    }
	
	static int giveFirstOccurance(int[] nums, int target, int st, int end)
	{
		for(int i=st;i<nums.length;i++)
		{
			if(nums[i] == target)
				return i;
		}
		
		return -1;
	}
	
	static int giveLastOccurance(int[] nums, int target, int st, int end)
	{
		for(int i=end;i>=0;i--)
		{
			if(nums[i] == target)
				return i;
		}
		
		return -1;
	}
	
	*/

}