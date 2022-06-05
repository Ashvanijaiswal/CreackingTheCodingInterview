package ArrayAndString;

public class MaximumEvenOddLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=maxOddEvenLen(new int[] {10,12,8,4});
		System.out.println(res);

	}

	private static int maxOddEvenLen(int[] arr) {
		// TODO Auto-generated method stub
		int prev=0,cur=0;
		int res=1,maxLen=1;
		
		for(int i=1;i<arr.length;i++)
		{
			prev=arr[i-1]%2;
			cur=arr[i]%2;
			if(prev!=cur)
			{
				maxLen++;
			}
			else
			{
				maxLen=1;
			}
			res=Math.max(maxLen, res);
		}
		return res;
	}

}
