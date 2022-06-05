package ArrayAndString;

public class FindComDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=15;
		int arr[]= {1,2,30,40,5,6,7,80};
		isComm(X,arr);

	}

	private static void isComm(int x, int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=true;
			int small=x>arr[i]?arr[i]:x;
			for(int j=2;j<=small;j++)
			{
				if(x%j==0 && arr[i]%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			System.out.print(arr[i]+" ");
		}
		
	}

}
