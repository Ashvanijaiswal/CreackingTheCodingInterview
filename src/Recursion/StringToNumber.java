package Recursion;

public class StringToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1234";
		System.out.println(conver(s,0));

	}

	private static int conver(String s,int i) {
		// TODO Auto-generated method stub
		if(i==s.length())
		{
			return 0;
		}
		return Integer.parseInt(s.charAt(i)+"")*(int)Math.pow(10,s.length()-i-1 )+conver(s, i+1);
		
	}

}
