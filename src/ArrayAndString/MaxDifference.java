package ArrayAndString;


public class MaxDifference {

//	problem- arr[j]-arr[i] maximum where j>i
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=maxDiff(new int[] {2,3,10,6,4,1});
		System.out.println(res);

	}

	private static int maxDiff(int[] arr) {
		// TODO Auto-generated method stub
		int res=arr[1]-arr[0];
		int minVal=arr[0];
		for(int j=1;j<arr.length;j++)
		{
			minVal=Math.min(minVal,	arr[j]);
			res=Math.max(res, arr[j]-minVal);
			
		}
		return res;
	}

}
