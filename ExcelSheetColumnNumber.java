/* Excel Sheet Column Number :- 
 
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

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
Input: columnTitle = "A"
Output: 1

Example 2:
Input: columnTitle = "AB"
Output: 28

Example 3:
Input: columnTitle = "ZY"
Output: 701
 
 
 */

package com.tanmay.LeetCodeEasyProblems;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) 
	{
		String columnTitle = "ZY";
		System.out.println(titleToNumber(columnTitle));
		
	}
	
	static int titleToNumber(String columnTitle) 
	{
        int sum=0,p=0;
        int n = columnTitle.length()-1;
        
        for(int i=n;i>=0;i--)
        {
        	int store = (columnTitle.charAt(i) + 1) - 'A';
        	
        	sum = sum + (int)Math.pow(26, p) * store;
        	p++;
        }
        
        return sum;
    }

}
