/* Word Pattern :- 
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
