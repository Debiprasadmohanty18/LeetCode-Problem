/* Reverse String :- 
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
