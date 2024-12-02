package com.SomeQuestionsOnBinarySearch;

public class PeakIndexInAMountainArray {

	public static void main(String[] args) {
		
		int[] arr = {2,4,5,6,8,10,11,17,7,6,5,4,3,1};
		System.out.println(peakIndexInMountainArray(arr));
	}
	
	static int peakIndexInMountainArray(int[] arr) 
	{
        int st = 0;
        int end = arr.length-1;
        
        while(st <= end)
        {
        	int mid = st + (end-st)/2;
        	
        	if(arr[mid] > arr[mid+1])
        	{
        		if(arr[mid] > arr[mid-1])
        			return mid;
        		else
        			end = mid;
        	}
        	else
        		st = mid+1;
        }
        
        return -1;
    }

}
