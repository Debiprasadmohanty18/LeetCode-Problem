/* Third Maximum Number :- 

Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Example 2:
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
 
*/

package com.tanmay.LeetCodeEasyProblems;
import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int[] arr = {3,2,1};
		System.out.println(thirdMaximum(arr));
	}
	
	static int thirdMaximum(int[] arr)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i : arr)
		{
			set.add(i);
		}
		
		int[] num = new int[set.size()];
		int j=0;
		
		for(int i : set)
		{
			num[j] = i;
			j++;
		}
		
		Arrays.sort(num);
		
		if(arr.length<3)
			return num[num.length-1];
		
		return num[num.length-3];
	}

}
