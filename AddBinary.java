package com.tanmay.LeetCodeEasyProblems;

public class AddBinary {

	public static void main(String[] args) 
	{
		
		String a = "11", b = "1";
		System.out.println(addBinary(a, b));
		
	}
	
	public static String addBinary(String a, String b) 
	{
        int i = a.length()-1;
        int j = b.length()-1;
        int carr = 0, base = 2;
        StringBuilder add = new StringBuilder();
        
        while(i>=0 || j>=0)
        {
        	int t1 = 0, t2 = 0, sum;
        	
        	if(i>=0)
        		t1 = a.charAt(i--) - '0';
        	if(j>=0)
        		t2 = b.charAt(j--) - '0';
        	
        	sum = t1+t2+carr;
        	
        	if(sum>=base)
        	{
        		carr = 1;
        		sum -= base;
        	}
        	else
        		carr = 0;
        	
        	add.append(sum);
        }
        
        if(carr==1)
        	add.append(carr);
        
        return add.reverse().toString();
    }

}
