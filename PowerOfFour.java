/* Power of Four :- 

Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.

Example 1:
Input: n = 16
Output: true

Example 2:
Input: n = 5
Output: false

Example 3:
Input: n = 1
Output: true
 
*/

package com.tanmay.LeetCodeEasyProblems;

public class PowerOfFour {

	public static void main(String[] args) 
	{
		int n=2;
		System.out.println(isPowerOfFour(n));
	}
	
	public static boolean isPowerOfFour(int n)
	{
		if(n>1)
		{
			while(n>=4)
			{
				if(n%4 != 0) 
					return false;
				n=n/4;
			}
		}
		return n==1;
	}

}
