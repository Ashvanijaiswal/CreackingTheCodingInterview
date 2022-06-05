package ArrayAndString;

public class SlidingWindowTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		problem -given a array of int and a number k ,find the maxmum sum of k consecutive integer.
		int max=maxSum(new int[] {1,8,30,-5,20,7},3);
		System.out.println(max);
	}

	private static int maxSum(int[] arr, int k) {
		// TODO Auto-generated method stub
		int maxSum=0,res=0;
//		int count=0;
//		for(int i=0;i<arr.length;)
//		{
//			maxSum+=arr[i];
//			if(count==k)
//			{
//				res=Math.max(res,maxSum);
//				maxSum=0;
//				i=(i+1)-k;
//				count=0;
//				System.out.println(i);
//			}
//		    i++;
//		    count++;
//		}
		for(int i=0;i<k;i++)
		{
			maxSum+=arr[i];
		}
		res=maxSum;
		for(int i=k;i<arr.length;i++)
		{
			maxSum+=arr[i]-arr[i-k];
			res=Math.max(res, maxSum);
		}
		return res;
	}

}
