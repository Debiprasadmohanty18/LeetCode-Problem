/*
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
