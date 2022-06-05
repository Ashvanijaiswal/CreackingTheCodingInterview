package Recursion;

import java.util.HashSet;

public class SubSet {

	static HashSet<String>  hs=new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subset("abc","",0);
		

	}

	private static void subset(String s, String cur,int i) {
		// TODO Auto-generated method stub
		
		
		if(s.length()==i)
		{
			System.out.println(cur);
			return;
		}
//		not included
		subset(s,cur,i+1);
//		if included
		subset(s,cur+s.charAt(i),i+1);
		

		
		
	}

}
