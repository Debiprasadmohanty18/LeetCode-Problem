/* Excel Sheet Column Title :-

Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

Example 1:
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Example 3:
Input: columnNumber = 701
Output: "ZY"
 
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
