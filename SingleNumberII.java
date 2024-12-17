/*
*/

package com.tanmay.LeetCodeEasyProblems;

public class SingleNumberII {

	public static void main(String[] args) {
		int[] nums = {2,2,3,2};
		System.out.println(singleNumber(nums));
	}
	
	static int singleNumber(int[] nums) 
	{
        for(int i=0;i<nums.length;i++)
        {
        	int count = 0;
        	for(int j=0;j<nums.length;j++)
        	{
        		if(i == j)
        			continue;
        		if(nums[i] == nums[j])
        			count++;
        	}
        	if(count == 0)
        		return nums[i];
        }
        
        return -1;
    }

}
