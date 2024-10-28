/*
*/

package com.tanmay.LeetCodeEasyProblems;

public class PowerOfThree {

	public static void main(String[] args) 
	{
		int n = 28;
		System.out.println(isPowerOfThree(n));
		
	}
	
	static boolean isPowerOfThree(int n)
	{
		while(n>=3)
		{
			if(n%3 != 0)
				return false;
			
			n=n/3;
		}
		return n==1;
	}

}
