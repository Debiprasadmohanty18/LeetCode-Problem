import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerUsingMap {
	public static void main(String[] args) {
		
		RomanToIntegerUsingMap ob = new RomanToIntegerUsingMap();
		ob.toInteger("MCMXCVI");
	}
	
	public void toInteger(String s)
	{
		
		Map<Character,Integer> items = new HashMap<>();
		items.put('I', 1);
		items.put('V', 5);
		items.put('X', 10);
		items.put('L', 50);
		items.put('C', 100);
		items.put('D', 500);
		items.put('M', 1000);
		
		
		int sum = items.get(s.charAt(s.length()-1));
		for(int i=0;i<s.length()-1;i++) 
		{			
			if(items.get(s.charAt(i)) >= items.get(s.charAt(i+1))) 
			{
				sum = sum + items.get(s.charAt(i));
			}
			else 
			{
				sum = sum - items.get(s.charAt(i));
			}
		}
		System.out.println(sum);	
	}
}
