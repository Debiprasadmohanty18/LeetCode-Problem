/*
*/
public class SQRT {
	public static void main(String[] args) {
		int x = 8;
		System.out.println(sqrtNum(x));
	}
	
	static int sqrtNum(int x)
	{
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
