/* Two Sum :-
 
 Given an array of integers numbs and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: numbs = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because numbs[0] + numbs[1] == 9, we return [0, 1].

Example 2:

Input: numbs = [3,2,4], target = 6
Output: [1,2]

*/

import java.util.Arrays;

class Solutions 
{
	public int[] twoSumOperation(int[] nums, int target)
	{
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = i+1; j < nums.length;j++) 
			{
				if (nums[i] + nums[j] == target) 
				{
					return new int []{i,j};
				}
			}
		}
		return nums;
	}
}

public class TwoSumBruteForce 
{
	public static void main(String[] args) 
	{
		Solutions obj = new Solutions();
		int [] numbs = {1,3,5,7};
		System.out.println(Arrays.toString(obj.twoSumOperation(numbs, 10)));
	}
}
