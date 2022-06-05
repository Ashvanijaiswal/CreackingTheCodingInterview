package bitoperation;

public class PowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=127;
		boolean res=isPowerOf2(n);
		System.out.println(res);
	}

	private static boolean isPowerOf2(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return false;
		}
		
		return (n&n-1)==0;
	}

}
