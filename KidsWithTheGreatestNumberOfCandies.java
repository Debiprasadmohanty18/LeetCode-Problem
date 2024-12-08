package Array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

	public static void main(String[] args) {
		
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		System.out.println(kidsWithCandies(candies, extraCandies));

	}
	
	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
	{
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++)
        {
        	if(max < candies[i])
        		max = candies[i];
        }
        
        for(int i=0;i<candies.length;i++)
        {
        	if(extraCandies + candies[i] >= max)
        		list.add(true);
        	else
        		list.add(false);
        }
        
        return list;
    }

}
