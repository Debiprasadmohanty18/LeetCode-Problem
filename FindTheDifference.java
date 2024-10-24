package com.tanmay.LeetCodeEasyProblems;

public class FindTheDifference {

	public static void main(String[] args) 
	{
		String s = "abcd", t = "abcde";
		System.out.println(findTheDifference(s, t));
	}
	
	public static char findTheDifference(String s, String t) 
	{
        
		int sum = 0;
		
		for(int i=0;i<t.length();i++)
		{
			sum = sum + t.charAt(i);
		}
		
		for(int i=0;i<s.length();i++)
		{
			sum = sum - s.charAt(i);
		}
        
		return (char)sum;
    }

}
