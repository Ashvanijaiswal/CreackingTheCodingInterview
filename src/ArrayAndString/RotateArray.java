package ArrayAndString;

import java.util.Arrays;
import java.util.List;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]=new int[] {10,2,3,4,5};
		int arr[]=rotateByD(new int[] {1,2,3,4,5},2);
//		List<Integer> l=Arrays.asList(10,20,30,40,50);
//		l.stream().forEach(x->System.out.println(x));
		
	}

	private static int [] rotateByD(int[] arr, int d) {
		// TODO Auto-generated method stub
		int index=0,i=0,temp=arr[i],temp2=0;
		int count=0;
		int n=arr.length;
		d=d%n;
		while(count++<arr.length)
		{
			index=(i+n-d)%n;
			temp2=arr[index];
		
			arr[index]=temp;
			i=index;
			temp=temp2;
		}
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		return arr;
		
	}

}
