package ArrayAndString;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		problem- find a subarray that has equal sum to given sum.
		boolean  res=equalSum(new int[] {1,4,0	,3,10,9,18,22},40);
		System.out.println(res);

	}

	private static boolean equalSum(int[] arr, int givensum) {
		// TODO Auto-generated method stub
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			while(sum>givensum)
			{
				System.out.println(sum);
				sum-=arr[count++];
			}
			if(sum==givensum)
			{
				return true;
			}
			
		}
		return false;
	}

}
