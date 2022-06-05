package sorting;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {319,212,6,8,100,50};
		System.out.println(Arrays.toString(arr));
		radixSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void radixSort(int[] arr) {
		// TODO Auto-generated method stub
		int max=Arrays.stream(arr).boxed().mapToInt(i->i).max().getAsInt();
		System.out.println(max);
		for(int exp=1;exp<max;exp=exp*10)
		{
			countingSort(arr,arr.length,exp);
		}
		
	}

	private static void countingSort(int[] arr, int n, int exp) {
		// TODO Auto-generated method stub
		int count[]=new int[10];
		int output[]=new int[n];
		for(int i=0;i<n;i++)
		{
			count[(arr[i]/exp)%10]++;
		}
		for(int i=1;i<10;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		for(int i=n-1;i>-1;i--)
		{
			output[count[(arr[i]/exp)%10]-1]=arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=output[i];
		}
		
	}

}
