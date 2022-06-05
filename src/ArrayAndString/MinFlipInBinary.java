package ArrayAndString;

public class MinFlipInBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMinFlipCount(new int[] {1,1,0,0,0,1,0,0,0,1,1,1,0});
		

	}

	private static void findMinFlipCount(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				if(arr[i]!=arr[0])
				{
					System.out.print("From "+i+" to ");
				}
				else
				{
					System.out.println(i-1);
				}
			}
		}
		if(arr[arr.length-1]!=arr[0])
		{
			System.out.println(arr.length-1);
		}
			
		

	}

}
