package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,80,10,85,75,99,18};
		int k=5;
		bucketSort(arr,k);
		System.out.println(Arrays.toString(arr));

	}

	private static void bucketSort(int[] arr, int k) {
		// TODO Auto-generated method stub
		int max=Arrays.stream(arr).boxed().mapToInt(i->i).max().getAsInt();
		int dist=max/k;
		ArrayList<Integer> a=new ArrayList<>(arr.length);
		
		
		
	}

}
