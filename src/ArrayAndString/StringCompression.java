package ArrayAndString;

public class StringCompression {

//	Problem: aabbbccccaaa= a2b3c4a3 smaller length then only  a2b3c4a3 else aabbbccccaaa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aaabbbccc";
		int res=compressedLength(s);
		if(res>s.length())
		{
			System.out.println(s);
			return ;
		}
		
		StringBuilder sb=new StringBuilder(res);
		int consecutive=0;
		for(int i=0;i<s.length();i++)
		{
			consecutive++;
			if(i+1>=s.length() ||s.charAt(i)!=s.charAt(i+1))
			{
				sb.append(s.charAt(i));
				sb.append(consecutive);
				consecutive=0;
			}
		}
		System.out.println(sb);
		
	}

private static int compressedLength(String s) {
	// TODO Auto-generated method stub
	int consecutiveLength=0;
	int compressedLength=0;
	
	for(int i=0;i<s.length();i++)
	{
		consecutiveLength++;
		if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1))
		{
			compressedLength+=1+String.valueOf(consecutiveLength).length();
			consecutiveLength=0;
		}
	}
	return compressedLength;
}

}
