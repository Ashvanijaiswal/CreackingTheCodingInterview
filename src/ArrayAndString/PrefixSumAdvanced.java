package ArrayAndString;

public class PrefixSumAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l[]= {1,2,3};
		int r[]= {3,5,7};
		printValue(l,r);

	}

	private static void printValue(int[] l, int[] r) {
		// TODO Auto-generated method stub
		int count=0,res=0;
		int maxcount=0;
		for(int i=1;i<=7;i++)
		{
			for(int j=0;j<l.length;j++)
			{
				if(i>=l[j] && i<=r[j])
				{
					count++;
				}
				if(count>maxcount)
				{
					maxcount=count;
					res=i;
				}
			}
			count=0;
		}
		System.out.println(res);
		
	}

}
