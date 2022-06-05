package ArrayAndString;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=removeDuplicate(new int[] {10,20,20,30,30,30},6);
		System.out.println(size);

	}

	private static int removeDuplicate(int[] arr, int size) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				arr[size-1]=0;
				size--;
			}
		}
		
		return size;
	}

}
