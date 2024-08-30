/* SQRT(x) :- 

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python. 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
*/
public class SQRT {
	public static void main(String[] args) {
		int x = 8;
		System.out.println(sqrtNum(x));
	}
	
	static int sqrtNum(int x)
	{
		// return (int) Math.sqrt(x);  // This Line also give the correct answer.
		int start = 1;
		int end = x;
		int answer = 0;
		while(start <= end)
		{
			int mid = start + (end-start)/2;
			if((mid*mid) == x)
			{
				answer = (int)mid;
				break;
			}
			else if((mid*mid) < x)
			{
				start = mid + 1;
				answer = mid;
			}
			else
			{
				end = mid -1;
			}
		}
		return (int)answer;
	}
}
