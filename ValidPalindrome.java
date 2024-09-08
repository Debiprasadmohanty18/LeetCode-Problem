
public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s)
	{
		String sentence = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		int length = sentence.length();
		int i=0;
		int j=length-1;
		while(i <= j)
		{
			if(sentence.charAt(i) == sentence.charAt(j))
			{
				i++;
				j--;
			}
			else 
			{
				return false;
			}
		}
		return true;
	}

}
