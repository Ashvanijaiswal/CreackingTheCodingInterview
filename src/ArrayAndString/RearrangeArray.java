package ArrayAndString;

public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {4,0,3,2,5,1};
		rearange(arr,arr.length);
	}

	private static void rearange(int[] arr, int n) {
		// TODO Auto-generated method stub
		int temp2=arr[0];
		int temp=arr[arr[0]];
		int count=0,i=0;
		for(i=0;i<n;i++)
		{
			arr[i]=i;
			System.out.print(arr[i]);
		}
		
	}

}
