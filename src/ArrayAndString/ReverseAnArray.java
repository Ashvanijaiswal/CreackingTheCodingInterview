package ArrayAndString;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(new int[] {3,5,2,1,7});

	}

	private static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0,j=arr.length-1;i<=arr.length/2;i++,j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		for(int a: arr)
		{
			System.out.println(a);
		}
		
		
	}

}
