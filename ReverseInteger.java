package com.tanmay.LeetCodeEasyProblems;

public class ReverseInteger {

	public static void main(String[] args) 
	{
		int n = 1534236469;
		System.out.println(reverse(n));
	}
	
	static int reverse(int x) 
	{
		long rev=0;
        while(x!=0)
        {
        	int rem = x%10;
        	rev = (rev*10) + rem;
        	x/=10;       	
        }
        
//        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
//        	return 0;
      
//        return (int) rev;
        
        return (rev > Integer.MAX_VALUE || rev <  Integer.MIN_VALUE) ? 0 : (int)rev;
    }

}
