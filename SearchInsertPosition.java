/* Search Insert Position :- 

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

--> You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/
public class SearchInsertPosition {
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5};
		System.out.println(searchInsert(nums, 9));
	}
	
	static int searchInsert(int [] nums, int target)
	{
		int startIndex = 0;
		int lastIndex = nums.length-1;
		
		while(startIndex <= lastIndex)
		{
			int midIndex = startIndex + (lastIndex - startIndex)/2;
			if(nums[midIndex] == target)
			{
				return midIndex;
			}
			else if (target < nums[midIndex]) 
			{
				lastIndex = midIndex -1;
			}
			else 
			{
				startIndex = midIndex +1;
			}
		}
		return startIndex;
	}
}
