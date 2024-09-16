/* Happy Number :- 
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true

Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Example 2:
Input: n = 2
Output: false

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
