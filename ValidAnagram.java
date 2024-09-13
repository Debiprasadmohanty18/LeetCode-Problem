import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) 
	{
		String s = "a";
		String t = "b";
		System.out.println(isAnagram(s, t));
	}
	
	public static boolean isAnagram(String s, String t)
	{
		char[] ch = s.toLowerCase().toCharArray();
		Arrays.sort(ch);
		
		char[] ch1 = t.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		
		int i=0;
		if(ch.length == ch1.length)
		{
			while(i < ch.length)
			{
				if(!(ch[i] == ch1[i]) )
				{
					return false;
				}
				i++;
			}
		}
		else 
		{
			return false;
		}
		return true;
	}

}
