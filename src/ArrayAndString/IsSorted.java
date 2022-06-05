package ArrayAndString;

public class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res=isSortedArray(new int[] {10,20,30,40,35});
		System.out.println(res);
	}

	private static boolean isSortedArray(int[] arr) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				flag=false;
			}
		}
		return flag;
	}

}
