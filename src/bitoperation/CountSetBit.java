package bitoperation;

public class CountSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=87;
		int setBit=countSetBit1(n);
		System.out.println(setBit);
		System.out.println(setBit);
	}

	private static int countSetBit(int n) {
		// TODO Auto-generated method stub
		int count=0;
		while(n>0)
		{
			count+=n&1;
			
			n=n>>1;
			
			
		}
		return count;
	}
//	Second method Brian Kernigam algo
	public static int countSetBit1(int n)
	{
		int count=0;
		while((n)>0)
		{
			count++;
			n=n&(n-1);
		}
		
		return count;
	}
//	Using dianamic programmming
	static int  dp[]=new int[256];
	public static void preProcess()
	{
		dp[0]=0;
		for(int i=1;i<256;i++)
		{
			dp[i]=(1&i)+dp[i/2];
		}
	}
	
	public static int  setBitCount(int n)
	{
		int count=0;
		count=dp[n&255];
		n=n>>8;
		count+=dp[n&255];
		n=n>>8;
		count+=dp[n&255];
		n=n>>8;
		count+=dp[n&255];
		return count;
	}

}
