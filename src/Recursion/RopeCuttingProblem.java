package Recursion;

public class RopeCuttingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxCut=ropeCut(23,12,9,11);
		System.out.println(maxCut);

	}

	public static int ropeCut(int n, int j, int k, int l) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return 0;
		}
		if(n<0)
		{
			return -1;
		}
		
		return Math.max(ropeCut(n-j, j, k, l),Math.max(ropeCut(n-k, j, k, l), ropeCut(n-l, j, k, l)))+1;
	}

}
