package ArrayAndString;

public class MaxSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=maxSum(new int[] {-11,-6,-5,-16,-7});
		System.out.println(result);

	}

	private static int maxSum(int[] arr) {
		// TODO Auto-generated method stb
		int res=arr[0];
		int maxEnd=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			maxEnd=Math.max(maxEnd+arr[i],arr[i]);
			res=Math.max(res, maxEnd);
		}
		return res;
	}

}
