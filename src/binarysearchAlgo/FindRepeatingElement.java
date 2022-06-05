package binarysearchAlgo;

public class FindRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,4,6,5,7,4};
		int res=findRepeating(arr);
		System.out.println(res);

	}

	private static int findRepeating(int[] arr) {
		// TODO Auto-generated method stub
		int slow=arr[0],fast=arr[0];
		int count=0;
		do {
			slow=arr[slow];
			fast=arr[arr[fast]];
			
		}while(slow!=fast);
		System.out.println(slow+" "+fast);
		slow=arr[0];
		while(slow!=fast)
		{
			slow=arr[slow];
			fast=arr[fast];
		}
		return slow;
	}

}
