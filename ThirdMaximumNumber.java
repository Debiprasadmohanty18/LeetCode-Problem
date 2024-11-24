package com.tanmay.LeetCodeEasyProblems;
import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int[] arr = {3,2,1};
		System.out.println(thirdMaximum(arr));
	}
	
	static int thirdMaximum(int[] arr)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i : arr)
		{
			set.add(i);
		}
		
		int[] num = new int[set.size()];
		int j=0;
		
		for(int i : set)
		{
			num[j] = i;
			j++;
		}
		
		Arrays.sort(num);
		
		if(arr.length<3)
			return num[num.length-1];
		
		return num[num.length-3];
	}

}
