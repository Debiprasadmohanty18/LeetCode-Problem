/* Is Subsequence :- 
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
*/

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "abef";
		String t = "abcdef";
		System.out.println(isSubsequence(s, t));
	}
	
	static boolean isSubsequence(String s,String t)
	{
		int countS = 0;
		int countT = 0;
		while(countS<s.length() && countT<t.length()) 
		{
			if(s.charAt(countS) == t.charAt(countT))
			{
				countS++;
			}
			countT++;
		}
		if (countS == s.length()) 
		{
			return true;
		}	
		return false;
	}
}
