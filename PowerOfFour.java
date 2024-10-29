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
