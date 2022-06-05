package ArrayAndString;

public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {2,8,3,9,6,5,4};
		int brr[]=preProcess(arr);
		int res=getSum(brr,2,6);
		System.out.println(res);
	}

	private static int[] preProcess(int[] arr) {
		// TODO Auto-generated method stub
		int brr[]=new int[arr.length];
		brr[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			brr[i]=brr[i-1]+arr[i];
//			System.out.println(brr[i]);
		}
		return brr;
	}

	private static int getSum(int brr[],int l, int r) {
		// TODO Auto-generated method stub
		if(l==0)
		{
			return brr[r];
		}
		return brr[r]-brr[l-1];
	}

}
