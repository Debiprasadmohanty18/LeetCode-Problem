package com.tanmay.LeetCodeEasyProblems;

public class FindTheSmallestLettterGreaterThanTarget {

	public static void main(String[] args) {
		char[] letters = {'c' , 'f' , 'j'};
		char target = 'j';
		System.out.println(nextGreatestLetter(letters, target));
	}
	
	static char nextGreatestLetter(char[] letters, char target) 
	{
		int st = 0;
		int end = letters.length-1;
		
		if(target >= letters[end]) return letters[st];
		
		while(st <= end)
		{
			int mid = st + (end - st)/2;
			
			if(letters[mid] > target) end = mid-1;
			
			else st = mid+1;
		}
		
		return letters[st];
    }

}
