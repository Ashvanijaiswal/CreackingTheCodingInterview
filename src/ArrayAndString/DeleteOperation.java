package ArrayAndString;

public class DeleteOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,7,8,10};
		deleteOperation(arr,3);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static int [] deleteOperation(int[] arr, int pos) {
		// TODO Auto-generated method stub
		for(int i=pos;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=0;
		return arr;
		
	}

}
