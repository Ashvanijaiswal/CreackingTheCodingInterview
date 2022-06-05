package Recursion;

public class RecursionWithLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);

	}

	private static void fun(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			System.out.println();
			return ;
		}
		for(int i=0;i<n;i++)
		{
			fun(n-1);
			System.out.print(n+" ");
		}
		
	}

}
