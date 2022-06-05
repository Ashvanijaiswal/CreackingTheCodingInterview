package ArrayAndString;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{1,1,2,3,4,4,4,4,4,4};
		int element=4;
		boolean b=isMajority(arr,element);
		System.out.println(b);
	}

	private static boolean isMajority(int[] arr, int element) {
		// TODO Auto-generated method stub
		int high=arr.length-1;
		int low=0;
		int middle=0;
		while(low<high)
		{
			middle=(high+low)/2;
			System.out.println(low+"   "+middle+" "+high);
			if(arr[middle]<element)
			{
				low=middle+1;
			}
			else if(arr[middle]>element)
			{
				high=middle-1;
			}
			else {
				if(arr[middle]==arr[middle-1])
				{
					high=middle;
					middle=(low+high)/2;
					continue;
				}
				break;
			}
			
		}
		System.out.println(middle);
		return (middle<arr.length/2 && arr[middle+arr.length/2]==element);
	}

}
