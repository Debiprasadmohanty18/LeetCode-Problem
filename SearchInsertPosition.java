/*
*/
public class SearchInsertPosition {
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5};
		System.out.println(searchInsert(nums, 2));
	}
	
	static int searchInsert(int [] nums, int target)
	{
		int startIndex = 0;
		int lastIndex = nums.length-1;
		
		while(startIndex <= lastIndex)
		{
			int mid = (startIndex + lastIndex)/2;
			if(nums[mid] == target)
			{
				return mid;
			}
			else if (nums[mid]>target) 
			{
				lastIndex = mid -1;
			}
			else 
			{
				startIndex = mid +1;
			}
		}
		return startIndex;
	}
}
