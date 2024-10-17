/* Reverse String :- 
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 
*/
package com.tanmay.LeetCodeEasyProblems;

public class ReverseString {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
	}
	
	static void reverseString(char[] s) 
	{
		int i = 0;
		int size = s.length-1;
		while(i<=size)
		{
			char temp = s[size];
			s[size] = s[i];
			s[i] = temp;
			size--;
			i++;	
		}
		System.out.println(s);
	}

}
