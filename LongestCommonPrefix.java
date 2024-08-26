/* Longest Common Prefix :-
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

*/

import java.util.Arrays;

public class LongestCommonPrefix 
{

	public static void main(String[] args) 
	{
		LongestCommonPrefix obj = new LongestCommonPrefix();
		String [] s = {"fruits","frog","dish"};
		System.out.println(obj.longestCommonPrefix(s));
	}
	
	public String longestCommonPrefix(String [] strs)
	{
		Arrays.sort(strs);
		String str1 = strs[0];
		String str2 = strs[strs.length-1];
		int index = 0;
		
		while(index < str1.length())
		{
			if(str1.charAt(index) == str2.charAt(index))
			{
				index++;
			}
			else 
			{
				break;	
			}
			
		}
		if(index == 0)
		{
			return "No Common Prefix";
		}
		else 
		{
			return str1.substring(0,index);
		}
		
	}

}