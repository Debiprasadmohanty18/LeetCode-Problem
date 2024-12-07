package Array;

import java.util.Arrays;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));

	}
	
	static int[] getConcatenation(int[] nums) 
	{
		int n = nums.length * 2;
		int[] arr = new int[n];
		for(int i=0, j=0;i<arr.length;i++)
		{
			
			arr[i] = nums[j];
			j++;
			if(j==nums.length)
				j = 0;
			
		}
        return arr;
    }

}
