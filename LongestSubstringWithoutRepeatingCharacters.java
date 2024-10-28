/* Longest Substring Without Repeating Characters :- 
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
