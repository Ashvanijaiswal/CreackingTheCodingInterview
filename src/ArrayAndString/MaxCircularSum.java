package ArrayAndString;

public class MaxCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=maxSum(new int[] {5,-2,3,4});
		System.out.println(res);

	}

	private static int maxSum(int[] arr) {
		// TODO Auto-generated method stub
		int res=arr[0],maxSum=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			maxSum=arr[i];
			for(int j=1;j<arr.length;j++)
			{
				int index=(i+j)%arr.length;
				maxSum=Math.max(maxSum+arr[index], arr[index]);
				res=Math.max(res, maxSum);
			}
		}
		return res;
	}

}
