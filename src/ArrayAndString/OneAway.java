package ArrayAndString;

public class OneAway {
	
//	problem: given two string. we need to check after performing one operation
//	either insert,replace or remove one can become another or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ale";
		String s2="aple";
		boolean b=oneAway(s1,s2);
		System.out.println(b);
		
	}

private static boolean oneAway(String s1, String s2) {
	// TODO Auto-generated method stub
	if(s1.length()==s2.length())
	{
		return oneEditReplace(s1,s2);
	}
	else if(s1.length()+1==s2.length())
	{
		return oneEditInsert(s1,s2);
	}
	else if(s1.length()-1==s2.length())
	{
		return oneEditInsert(s2,s1);
	}
	
	return false;
}

private static boolean oneEditInsert(String s2, String s1) {
	// TODO Auto-generated method stub
	 int index1=0;
	 int index2=0;
	 boolean found=false;
	 while(index1<s1.length() && index2<s2.length())
	 {
		 if(s1.charAt(index1)!=s2.charAt(index2))
		 {
			 if(found)
			 {
				 return false;
			 }
			 found=true;
			 index1++;
			 continue;
			 
		 }
		 
		 index1++;
		 index2++;
	 }
	 
	return true;
}

private static boolean oneEditReplace(String s1, String s2) {
	// TODO Auto-generated method stub
	boolean found=false;
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)!=s2.charAt(i))
		{
			if(found)
			{
				return false;
			}
			found=true;
		}
	}
	return true;
}
	
	
	
}
