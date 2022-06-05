package ArrayAndString;

public class MergeTwoSortedArray {

//	Problem: Merge two sorted array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {2,5,7,11,15,41,43};
		int brr[]= {4};
		int crr[]=merge(arr,brr);
		for(int i=0;i<crr.length;i++)
		System.out.println(crr[i]);
	}

private static int[] merge(int[] arr, int[] brr) {
	// TODO Auto-generated method stub
	if(arr.length==0)
	{
		return brr;
	}
	if(brr.length==0)
	{
		return arr;
	}
	
	int crr[]=new int[arr.length+brr.length];
	
	int k=0,i=0,j=0;
	for(i=0,j=0;i<arr.length && j<brr.length;)
	{
		if(arr[i]<=brr[j] )
		{
			crr[k++]=arr[i];
			i++;
		}
		else
		{
			crr[k++]=brr[j];
			j++;
			
		}
		
	}
	
		while(i!=arr.length)
		{
			crr[k++]=arr[i];
			i++;
		}
	
	
	
		while(j!=brr.length)
		{
			crr[k++]=brr[j];
			j++;
		}
	
	return crr;
}

}
