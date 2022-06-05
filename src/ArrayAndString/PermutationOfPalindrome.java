package ArrayAndString;

public class PermutationOfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="tactcboapabpax";
		boolean res=isPermutationofPalindrom(str);
		boolean res1=isPermutationofPalindrom1(str);
		System.out.println(res1);
		System.out.println(res);

	}

	private static boolean isPermutationofPalindrom1(String str) {
		// TODO Auto-generated method stub
		int val=0;
		
		for(char ch:str.toCharArray())
		{
			if((val>>(ch-'a')&1)==1)
			{
				val^=1<<ch-'a';
			}
			else
			val |=(1<<(ch-'a'));
		}
		return (val&(val-1))==0;
	}

	private static boolean isPermutationofPalindrom(String str) {
		// TODO Auto-generated method stub
		char table[]=new char[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		int countOdd=0;
		for(char ch:str.toCharArray())
		{
			int x=getIntValue(ch);
			if(x!=-1)
			{
				table[x]++;
				if(table[x]%2==1)
				{
					countOdd++;
				}
				else
				{
					countOdd--;
				}
			}
		}
		return countOdd<=1;
	}

	private static int getIntValue(char ch) {
		// TODO Auto-generated method stub
		int val=Character.getNumericValue(ch);
		int a=Character.getNumericValue('a');
		int z=Character.getNumericValue('z');
//		System.out.println(a+" "+z);
		if(val>=a && a<=z)
		{
			
			return val-a;
		}
		return -1;
		
	}

}
