package Recursion;

public class JustToCheck {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fn(4);
		System.out.println(count);
		String s="AB";
		char ch='C';
		String sb="";
		for(int i=0;i<=2;i++)
		{
			sb=s.substring(0,i)+ch+s.substring(i);
			System.out.println(sb);
		}
	}

	private static void fn(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			count++;
			return ;
		}
		fn(n-1);
		fn(n-1);
		
	}

}
