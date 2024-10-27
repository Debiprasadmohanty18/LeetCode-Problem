/* First Unique Character in a String :- 

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"

Output: -1

 

*/

package com.tanmay.LeetCodeEasyProblems;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
	}
	
	public static int firstUniqChar(String s) 
	{
        int[] freq = new int[26];
        
        for(char ch : s.toCharArray())
        	freq[ch - 'a']++;
        
        for(int i=0;i<s.length();i++)
        {
        	if(freq[s.charAt(i)-'a'] == 1)
        		return i;
        }
        return -1;
    }

}
