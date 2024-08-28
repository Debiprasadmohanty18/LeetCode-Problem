/*  Remove Element :- 
*/
public class RemoveElement {
	public static void main(String[] args) {
		RemoveElement obj = new RemoveElement();
		int [] nums = {0,1,2,2,3,0,4,2};
		System.out.println(obj.removeElement(nums, 2));
	}
	
	public int removeElement(int [] nums, int val)
	{
		int arrValue = 0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] != val)
			{
				nums[arrValue] = nums[i];
				System.out.print(nums[arrValue] + " ");
				arrValue++;
			}
		}
		System.out.println();
		return arrValue;
		
	}
}
