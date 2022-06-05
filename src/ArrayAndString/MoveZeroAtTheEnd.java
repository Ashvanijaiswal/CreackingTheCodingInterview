package ArrayAndString;

public class MoveZeroAtTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveZero(new int[] {10,0,0,0,10,0,20,30,0,90});
		

	}

	private static void moveZero(int[] arr) {
		// TODO Auto-generated method stub
		int preNonZeroIndex=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				
				swap(arr,i,preNonZeroIndex);
				preNonZeroIndex++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
			
			
		
		
		
		
	}

	private static void swap(int[] arr, int i, int preNonZeroIndex) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[preNonZeroIndex];
		arr[preNonZeroIndex]=temp;
		
	}

}
