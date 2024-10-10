/* Missing Number :-
*/
package com.tanmay.LeetCodeEasyProblems;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {1,0,3,4};
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i] == i)
        //     {
        //         continue;
        //     }
        //     else
        //     {
        //         return i;
        //     }
        // }
        // return nums.length;
        int n = nums.length;

        int sum = n*(n+1)/2; // sum of numbers 0 ~ n

        for(int num : nums){
            sum -= num;
        } 
        return sum;
    }

}
