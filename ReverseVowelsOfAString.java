package com.tanmay.LeetCodeEasyProblems;

public class ReverseVowelsOfAString {

	public static void main(String[] args) 
	{
		String s = "leetcode";
		System.out.println(reverseVowels(s));
	}
	
	static String reverseVowels(String s) 
	{        
        int start = 0;
        int end = s.length()-1;
        char[] ch = s.toCharArray();
        
        while(start < end)
        {
        	if(!isVowel(ch[start]))
        		start++;
        	else if (!isVowel(ch[end])) 
        		end--;
        	else
        	{
        		char temp = ch[start];
        		ch[start] = ch[end];
        		ch[end] = temp;
        		start++;
        		end--;
        	}
        }
        
        return String.valueOf(ch);
        
    }


	public static boolean isVowel(char ch) 
	{
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch  == 'o' || ch == 'u')
    	{
    		return true;
    	}
    	return false;		
	}

}
