import java.util.HashMap;

public class ContainsDuplicate_II {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		System.out.println(containsNearbyDuplicate(nums, k));
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) 
	{
	      HashMap<Integer, Integer> map = new HashMap<>();
	      for(int i=0;i<nums.length;i++)
	      {
	    	  if(!map.containsKey(nums[i]))
	    	  {
	    		 map.put(nums[i], i); 
	    	  }
	    	  else
    		  {
	    		  int pastValue = map.get(nums[i]);
    			  if(Math.abs(pastValue - i) <= k)
    			  {
    				  return true;
    			  }
    			  map.put(nums[i], i);
    		  }
	      }
	      return false;
	}
}
