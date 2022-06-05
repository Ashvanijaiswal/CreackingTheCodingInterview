package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {21,22,23,69,8,8,9};
		
		mergeSort(arr,0,6);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high) {
		int mid=(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int n1=mid-low+1;
		int n2=high-mid;
		int a[]=new int[n1];
		int b[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			a[i]=arr[i+low];
		}
		
		for(int i=0;i<n2;i++)
		{
			b[i]=arr[mid+1+i];
		}
//		21,22,23,69,8,8,9
		int i=0,j=0,k=low;
		while(i<a.length && j<b.length)
		{
			if(a[i]<=b[j])
			{
				arr[k]=a[i];
				i++;
			}
			else
			{
				arr[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length)
		{
			arr[k]=a[i];
			i++;
			k++;
		}
		
		while(j<b.length)
		{
//			System.out.println(k);
			arr[k]=b[j];
			k++;
			j++;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
