package Recursion;

public class JoshephProblem {
	
	public static void main(String []args) {
		// TODO Auto-generated method stub
		int res=findWinner(5,3,3);
		System.out.println(res);

	}

	public static int findWinner(int n, int j, int k) {
		// TODO Auto-generated method stub
		if(n==1)
		{
			return k;
		}
		return findWinner(n-1, j, (Math.abs(n-j)+k)%n);
	}

}
