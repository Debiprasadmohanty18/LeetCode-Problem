/* Consecutive Characters :-
The power of the string is the maximum length of a non-empty substring that contains only one unique character.
Given a string s, return the power of s.

Example 1:
Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

Example 2:
Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

*/
public class ConsecutiveCharacters {

	public static void main(String[] args) 
	{
		String s = "aabbccxtbdadd";
		System.out.println(maxCount(s));
	}

	public static int maxCount(String s)
	{
		int i = 0,j = 1;
		int x = 1;
		int ans = 1;
		while(i<s.length()-1)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				x++;
				i++;
				j++;
				if(x > ans)
				{
					ans = x;
				}
			}
			else 
			{
				
				i++;
				j++;
				x = 1;
			}
			
		}
		return ans;
	}
}
