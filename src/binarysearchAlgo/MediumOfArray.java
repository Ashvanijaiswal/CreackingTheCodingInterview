package binarysearchAlgo;

public class MediumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {1,2,3,4,5,6,7};
		double res=findmedian(arr1,arr2);
		System.out.println(res);

	}

	private static double findmedian(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
		if(a1.length>a2.length)
		{
			int temp[]=a1;
			a1=a2;
			a2=temp;
		}
		int low=0,high=a1.length;
		while(low<=high)
		{
			int i=(low+high)/2;
			int i2=(a1.length+a2.length+1)/2-i;
			System.out.println(i);
			if(i!=0 && a1[i]>=a2[i2-1])
			{
				if(a2[i2]>=a1[i-1]) {
				int m1=Math.max(a1[i-1], a2[i2-1]);
				int m2=Math.min(a1[i], a2[i2]);
				if(((a1.length+a2.length)&1)==0)
				{
					return (m1+m2)/2;
				}
				return m1;
				}
				else
				{
					high=i-1;
				}
				
			}
			else {
				low=i+1;
			}
		}
		return -1;
	}

}
