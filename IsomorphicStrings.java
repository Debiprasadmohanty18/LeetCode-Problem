import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) 
	{
		String s = "tddd";
		String t = "aggg";
		System.out.println(isomorphic(s,t));

	}

	public static boolean isomorphic(String s, String t) 
	{
		HashMap<Character, Character> ch = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(ch.containsKey(s.charAt(i)))
			{
				if(!ch.get(s.charAt(i)).equals(t.charAt(i)))
				{
					return false;
				}
			}
			else if(ch.containsValue(t.charAt(i)))
			{
				return false;
			}
			else
			{
				ch.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}

}
