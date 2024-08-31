/*
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
