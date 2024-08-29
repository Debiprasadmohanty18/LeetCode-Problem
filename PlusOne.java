import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {9,9};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
	
	static int[] plusOne(int[] digits)
	{
		for(int i=digits.length - 1;i>=0;i--)
		{	
			if(digits[i] < 9)
			{
				digits[i]++;
				return digits;
			}	
			digits[i] = 0;
		}
		
		// If the Array having only 9.
		int[] newDigits = new int[digits.length + 1];
		newDigits[0] = 1;
		return newDigits;
	}
}
