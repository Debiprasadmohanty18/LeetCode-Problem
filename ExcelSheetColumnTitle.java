/* Excel Sheet Column Title :-
*/


package com.tanmay.LeetCodeEasyProblems;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) 
	{
		int columnNumber = 28;
		System.out.println(convertToTitle(columnNumber));
	}
	
	public static String convertToTitle(int columnNumber) 
	{
        StringBuilder sb = new StringBuilder();
        
        while(columnNumber>0)
        {
        	int rem = (columnNumber - 1)%26;
        	sb.append((char)(rem + 'A'));
        	columnNumber = (columnNumber - 1)/26;
        }
        
        return sb.reverse().toString();
    }

}
