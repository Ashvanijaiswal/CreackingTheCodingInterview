package ArrayAndString;

public class CheckPermutation {

//	Problem 2: Check one string is permutation of other string.
//	Time complexity- O(2n)
//	Space complexity- O(n)
//	Second solution Time complexity=O(n)
//	Space complexity- O(1)
	public static void main(String[] args) {
		
		String s1="abczdb";
		String s2="cbaxdd";
		boolean res=isPermutation(s1,s2);
		boolean res1=isPermutaion2(s1,s2);
		System.out.println(res1);
		System.out.println(res);
		
		
		
		// TODO Auto-generated method stub

	}

	private static boolean isPermutaion2(String s1, String s2) {
	// TODO Auto-generated method stub
		if(s1.length()!=s2.length())
		{
			return false;
		}
		int sum1=0,sum2=0;
		for(int i=0;i<s1.length();i++)
		{
			sum1+=s1.charAt(i);
			sum2+=s2.charAt(i);
		}
		if(sum1!=sum2)
		{
			return false;
		}
	return true;
}

	private static boolean isPermutation(String s1, String s2) {
		
		if(s1.length()!=s2.length())
		{
			return false;
		}
		boolean arr[]=new boolean[26];
		for(int i=0;i<s1.length();i++)
		{
			arr[s1.charAt(i)-'a']=true;
		}
		
		for(int i=0;i<s2.length();i++)
		{
			if(!arr[s2.charAt(i)-'a'])
			{
				return false;
			}
		}

		// TODO Auto-generated method stub
		return true;
	}

}
