package Recursion;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6785;
		int sum=sumOfDigit(n,0);
		System.out.println(sum);
	}

	public static int sumOfDigit(int n,int res) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return res;
		}
		return sumOfDigit(n/10,res+n%10);
	}

}
