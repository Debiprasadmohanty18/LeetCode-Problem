/* Longest Substring Without Repeating Characters :- 

Given a string s, find the length of the longest 
substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3

Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1

Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3

Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/

package com.tanmay.LeetCodeEasyProblems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> ss = new HashMap<Character, Integer>();
        int start = 0, len = 0;
        
        for(int end=0;end<s.length();end++)
        {
        	char ch = s.charAt(end);
        	
        	if(ss.containsKey(ch))
        	{
        		if(start<=ss.get(ch))
        		{
        			start = ss.get(ch)+1;
        		}
        	}
    		len = Math.max(len, end-start+1);
			ss.put(ch, end);
        }
        return len;
    }
}
