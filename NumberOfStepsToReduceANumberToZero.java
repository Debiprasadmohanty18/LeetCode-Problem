package com.tanmay.LeetCodeEasyProblems;

public class NumberOfStepsToReduceANumberToZero {

	public static void main(String[] args) {
		int n = 123;
		System.out.println(countStep(n));
	}
	
	static int countStep(int n)
	{
		return stepsNeeded(n,0);
	}

	private static int stepsNeeded(int n, int steps) 
	{
		if(n == 0)
			return steps;
		else if (n % 2 == 0) 
		{
			return stepsNeeded(n/2, steps+1);			
		}
		else 
		{
			return stepsNeeded(n-1, steps+1);
		}
	}

}
