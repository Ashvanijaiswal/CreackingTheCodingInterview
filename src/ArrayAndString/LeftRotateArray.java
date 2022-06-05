package ArrayAndString;

public class LeftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		leftRotate(new int[] {1,2,3,4,5},k);

	}

	private static void leftRotate(int[] arr,int k) {
		// TODO Auto-generated method stub
		int temp[]=new int[k+1];
		int d=0;
		for(int i=0;i<arr.length-k;i++)
		{
			temp[d++]=arr[(arr.length-k+i)%arr.length];
			arr[(arr.length-k+i)%arr.length]=arr[i];
			
		}
		for(int i=0;i<k;i++)
		{
			arr[arr.length-i]=temp[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
