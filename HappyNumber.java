/* Happy Number :- 
*/
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) 
	{
		int n = 100;
		System.out.println(isHappy(n));
	}
	
	public static boolean isHappy(int n)
	{
		Set<Integer> set = new HashSet<>();
		int rem=0;
		while(!set.contains(n))
		{
			int sum=0;
			set.add(n);
			while(n > 0)
			{	
				rem = n%10;
				sum = sum + (int) Math.pow(rem, 2);
				n = n/10;	
			}
			n = sum;
		}
		return n==1;
	}
}
