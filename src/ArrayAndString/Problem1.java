package ArrayAndString;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {

//	Problem: Find if all char of string is uniq or not without any additional data structure
//	both solution has O(n) time complexity 
//	first method has O(n) space complexity
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ashvnikdptmxyz";
		boolean res=isUniqChar(s);
		System.out.println(res);
		boolean res1=isUniqChars2(s);
		System.out.println(res1);
	}

private static boolean isUniqChars2(String s) {
	int check=0;
	for(int i=0;i<s.length();i++)
	{
		int val=s.charAt(i)-'a';
		if((check&(1<<val))!=0)
		{
			return false;
		}
		check|=1<<val;
	}
	// TODO Auto-generated method stub
	return true;
}

private static boolean isUniqChar(String s) {
	Set<Character> h=new HashSet<Character>();
	int i=0;
	for( i=0;i<s.length();i++)
	{
		if(h.contains(Character.toLowerCase(s.charAt(i))))
		{
			
			return false;
			
		}
		h.add(Character.toLowerCase(s.charAt(i)));
	}
	if(i==s.length())
	{
		return true;
	}
	return false;
}

}
