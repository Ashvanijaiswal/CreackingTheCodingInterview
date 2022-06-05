package Recursion;

public class SubSetSumProblem {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,10,5,2,3,6};
		int sum=6;
		int result=findCount(arr,sum,0,0);
		System.out.println(result);
	}

	private static int findCount(int[] arr, int sum, int i, int curSum) {
		// TODO Auto-generated method stub
		
		if(arr.length==i)
		{
			return (curSum==sum)?1:0;
		}
		
		int res=findCount(arr, sum, i+1, curSum)+findCount(arr, sum, i+1, curSum+arr[i]);
		
		
		return res;
	}

}
