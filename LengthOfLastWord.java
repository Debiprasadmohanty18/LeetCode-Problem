/* Length of Last Word :- 
*/
public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(s));
	}
	
	static int lengthOfLastWord(String s)
	{
		int countChar = 0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i) != ' ')
			{
				countChar++;
			}
			else if(s.charAt(i) == ' ' && countChar != 0)
			{
				break;
			}
		}
		return countChar;
	}
}
