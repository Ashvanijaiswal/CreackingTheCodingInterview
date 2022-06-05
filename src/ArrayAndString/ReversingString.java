package ArrayAndString;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Ashvani";
		String res=reverse(s.toCharArray(),s.length());
		System.out.println(res);
		StringBuilder sb=new StringBuilder(s);
		System.out.print(sb.reverse());
		
	}
	
	public static String toString(char [] ch)
	{
		String s=new String(ch);
		return s;
	}

	private static String reverse(char[] charArray,int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n/2;i++)
		{
			char temp;
			temp=charArray[i];
			charArray[i]=charArray[n-1-i];
			charArray[n-1-i]=temp;
		}
		return toString(charArray);
	}

}
