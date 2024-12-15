package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}
	
	static int[] createTargetArray(int[] nums, int[] index) 
	{
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<index.length;i++)
		{
			list.add(index[i],nums[i]);
		}
		
		int[] resArr = new int[nums.length];
        for(int i=0;i<list.size();i++)
        {
        	resArr[i] = list.get(i); 
        }
        
        return resArr;
    }

}
