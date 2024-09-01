
public class MajorityElement {

	public static void main(String[] args) 
	{
		int[] nums = {2,2,1,1,7,4};
		System.out.println(majorityElement(nums));
		
	}
	
	 public static int majorityElement(int[] nums) 
	 {
		 int count = 0;
		 int majorElement = 0;
	     for(int i=0;i<nums.length;i++)
	     {
	    		 if(count == 0)
	    		 {
	    			 majorElement = nums[i];
	    		 }
	    		 if(majorElement == nums[i])
	    		 {
	    			 count++;
	    		 }
	    		 else 
	    		 {
					count--;
				 }
	     }
	     return majorElement;
	 }

}
