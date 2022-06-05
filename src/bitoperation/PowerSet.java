package bitoperation;

public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		int len=s.length();
		generatePowerSet(s,len);

	}

	private static void generatePowerSet(String s,int len) {
		// TODO Auto-generated method stub
		for(int i=0;i<(int)Math.pow(2, len);i++)
		{
			int x=i;
			for(int j=0;j<len;j++)
			{
				if(((x>>j)&1)==1)
				{
					System.out.print(s.charAt(j)+"");
				}
			}
			System.out.println();
		}
		
	}

}
