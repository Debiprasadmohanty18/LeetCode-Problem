/*
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
