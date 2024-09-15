/* Word Pattern :-
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter. 

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Explanation:
The bijection can be established as:
'a' maps to "dog".
'b' maps to "cat".

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

*/

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) 
	{
		String pattern = "aaa";
		String s = "aa aa aa aa";
		System.out.println(wordPattern(pattern, s));
	}
	
	public static boolean wordPattern(String pattern, String s)
	{
		char[] ch = pattern.toCharArray();
		String[] t = s.split(" ");
		HashMap<Character, String> map = new HashMap<>();
		if(ch.length != t.length)
		{
			return false;
		}
		for(int i=0;i<pattern.length();i++)
		{
			if(map.containsKey(ch[i]))
			{
				if(!(map.get(ch[i]).equals(t[i])))
				{
					return false;
				}
			}
			else 
			{
				if(map.containsValue(t[i]))
				{
					return false;
				}
				map.put(ch[i], t[i]);
			}			
		}
		return true;
	}
}
