/* Intersection Of Two Arrays :-
Given two integer arrays nums1 and nums2, return an array of their intersection
Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
  
 
*/

package Array;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		System.out.println(Arrays.toString(intersection(nums1, nums2)));

	}
	
	static int[] intersection(int[] nums1, int[] nums2) 
	{
        HashSet<Integer> set1 = new HashSet<Integer>();
        
        for(Integer i : nums1)
        {
        	set1.add(i);
        }
        
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(Integer j : nums2)
        {
        	if(set1.contains(j))
        		set2.add(j);
        }
        
        int len = set2.size();
        int[] resArr = new int[len];
        int ind = 0;
        
        for(Integer e : set2)
        {
        	resArr[ind++] = e;
        }
        
        return resArr;
        
    }
}
