package ArrayAndString;

public class URLify {

//	Problem : Given a string with its true length. To replace all white space to %20
	
	public static void main(String[] args) {
		
		String s="My Name is Ashvani        ";
		int tlen=18;
		urlifyReplace(s.toCharArray(),tlen);

	}

private static void urlifyReplace(char []ch, int tlen) {
	// TODO Auto-generated method stub

	int spaceCount=0;
	for(int i=0;i<tlen;i++)
	{
		if(ch[i]==' ')
		{
			spaceCount++;
		}
	}
	System.out.println(tlen);
	int index=tlen+2*spaceCount;
	System.out.println(index);
//	if(tlen<ch.length)
//	{
//		ch[tlen]='\0';
//	}
	for(int i=tlen-1;i>=0;i--)
	{
		if(ch[i]==' ')
		{
			ch[index-1]='0';
			ch[index-2]='2';
			ch[index-3]='%';
			index-=3;
			
		}
		else
		{
			ch[index-1]=ch[i];
			index--;
		}
		
	}
	System.out.println(ch);
}

}
