

class Solution {
    public boolean isPalindrome(int x) {
        int rem = 0,sum = 0;
        int temp = x;

        if(x<0)
        {
            return false;
        }
        
        while(x>0)
        {
            rem = x%10;
            sum = (sum*10)+rem;
            x = x/10;
        }
        if(sum==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class PalindromeNumber {

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.isPalindrome(121));
	}

}
