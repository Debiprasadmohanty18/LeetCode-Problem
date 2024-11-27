package com.tanmay.LeetCodeEasyProblems;

public class FindNumbersWithEvenNumberOfDigits {

	public static void main(String[] args) {
				
		int[] nums = {555,901,482,1771};
		System.out.println(findNumbers(nums));
	}
	
	public static int findNumbers(int[] nums) 
	{
		int count = 0;
		int countEven = 0;
		for(int i=0;i<nums.length;i++)
		{
			if(isEven(nums[i], count) % 2 == 0)
				countEven++;
		}
		
		return countEven;
    }
	
	static int isEven(int num, int c)
	{
		if(num == 0) return c;
		return isEven(num/10, c+1);
	}

}
