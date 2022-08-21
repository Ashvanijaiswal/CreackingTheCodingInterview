package HashingAlgorithm;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {5,8,-4,4,9,-2,2};
//		int sum=13;
//	    int res=subArraySize(arr,sum);
//	    System.out.println(res);
	    int a = 1;
	    int b = a++;
	    System.out.println(a);	

	}

	private static int subArraySize(int[] arr, int sum) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap<>();
		int prefixSum=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			prefixSum+=arr[i];
			if(prefixSum==sum)
			{
				max=Math.max(max, i+1);
			}
			if(hm.containsKey(prefixSum))
			{
				max=Math.max(max, i-hm.get(prefixSum));
			}
			else
			{
				hm.put(prefixSum+sum, i);
			}

		}
		return max;
	}

}
