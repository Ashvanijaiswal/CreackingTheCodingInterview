package ArrayAndString;

import java.util.Arrays;

public class Eratorthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=120;
		seive(n);
		
	}

	private static void seive(int n) {
		// TODO Auto-generated method stub
		boolean isPrime[] =new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i=2;i*i<=n;i++)
		{
			if(isPrime[i])
			{
				
			
			for(int j=2*i;j<=n;j=i+j)
			{
				isPrime[j]=false;
			}
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
			}
		}
		
		
	}

}
