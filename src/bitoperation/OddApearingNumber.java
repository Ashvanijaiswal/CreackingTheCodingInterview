package bitoperation;

public class OddApearingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,3,4,8,4,4,9,7,7};
		oddApearning(arr);

	}

	public static void oddApearning(int[] arr) {
		// TODO Auto-generated method stub
		int xor=0,res1=0,res2=0;
		for(int i=0;i<arr.length;i++)
		{
			xor^=arr[i];
		}
		
		int lb=xor&~(xor-1);
		System.out.println(lb);
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]&lb)!=0)
			{
				res1=res1^arr[i];
			}
			else
			{
				res2=res2^arr[i];
			}
		}
		System.out.println(res1+" "+res2);
	}

}
