
public class MergeSortedArray {

	public static void main(String[] args) 
	{
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3, n = 3;
		int[] nums2 = {2,5,6};
		merge(nums1, m, nums2, n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) 
	{
        int lastIndex = m+n-1;
        int lengthOfFirstArray = m-1;
        int lengthOfSecondArray = n-1;
        
        while(lengthOfSecondArray >= 0)
        {
        	if(lengthOfFirstArray >= 0 && nums1[lengthOfFirstArray] > nums2[lengthOfSecondArray])
        	{
        		nums1[lastIndex] = nums1[lengthOfFirstArray];
        		lastIndex--;
        		lengthOfFirstArray--;
        	}
        	else 
        	{
				nums1[lastIndex] = nums2[lengthOfSecondArray];
				lastIndex--;
				lengthOfSecondArray--;	
			}
        }
        for(int v : nums1)
        {
        	System.out.print(v + " ");
        }
    }
}
