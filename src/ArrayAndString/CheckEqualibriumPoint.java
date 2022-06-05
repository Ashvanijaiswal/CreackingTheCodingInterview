package ArrayAndString;

import java.util.Arrays;

public class CheckEqualibriumPoint {

	static int[]temp1,temp2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {4,-2,2};
		preProcess(arr);
		boolean b=equlibrium(arr);
		System.out.println(b);

	}

	private static void preProcess(int[] arr) {
		// TODO Auto-generated method stub
		temp1=new int[arr.length];
		temp2=new int[arr.length];
		int n=arr.length;
		for(int i=1;i<arr.length;i++)
		{
			temp1[i]=temp1[i-1]+arr[i-1];
			temp2[n-1-i]=temp2[n-1-i+1]+arr[n-1-i+1];
		}
		
		
	}

	private static boolean equlibrium(int[] arr) {
		// TODO Auto-generated method stub
//		for(int i=0;i<arr.length;i++)
//		{
//			if(temp1[i]==temp2[i])
//			{
//				System.out.println(temp1[i]);
//				return true;
//			}
//		}
		int sum=Arrays.stream(arr).sum();
		int prefix=0;
		int suffix=sum-arr[0];
		if(prefix==suffix)
		{
			return true;
		}
		for(int i=1;i<arr.length;i++)
		{
			prefix=prefix+arr[i-1];
			suffix=sum-prefix-arr[i];
			if(prefix==suffix)
			{
				System.out.println(prefix);
				return true;
			}
			
			
		}
		return false;
	}

}
