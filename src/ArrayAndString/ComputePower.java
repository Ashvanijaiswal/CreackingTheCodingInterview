package ArrayAndString;

public class ComputePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		int n=5;
		int res=power2(x,n);
		System.out.println(res);

	}

	private static int power(int x, int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return 1;
		}
		int temp=power(x,n/2);
		temp=temp*temp;
		if((n&1)==0)
		{
			return temp;
		}
		return x*temp;
		
	}
	private static int power2(int x, int n)
	{
		int res=1,p;
		while(n>0)
		{
			
			if((n&1)==1)
			{
				res*=x;
			}
			n=n>>1;
			x=x*x;
		}
		return res;
	}
}
