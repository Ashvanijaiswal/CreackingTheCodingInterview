package Recursion;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abba";
		boolean b=isPalindrome(s,0,s.length()-1);
		System.out.println(b);

	}

	private static boolean isPalindrome(String s, int start,int end) {
		// TODO Auto-generated method stub
		if(start>=end)
		{
			return true;
		}
		
		return s.charAt(start)==s.charAt(end) && isPalindrome(s,start+1,end-1);
		
	}

}
