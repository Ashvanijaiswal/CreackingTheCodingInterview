package ArrayAndString;

public class RapingWaterProblemAlgo {

//	FindMax voulme to store water.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=maximumValoume(new int[] {3,0,1,2,5});
//		System.out.println(res);
		int res1=efficentWay(new int[] {3,0,1,2,5});
		System.out.println(res1);

	}

private static int efficentWay(int[] arr) {
	// TODO Auto-generated method stub
	int res=0;
	int []lmax=new int[arr.length];
	int []rmax=new int[arr.length];
	lmax[0]=arr[0];
	rmax[arr.length-1]=arr[arr.length-1];
	for(int i=1;i<arr.length;i++)
	{
		lmax[i]=Math.max(lmax[i-1], arr[i]);
//		System.out.print(lmax[i]+" ");
	}
	for(int i=arr.length-2;i>0;i--)
	{
		rmax[i]=Math.max(rmax[i+1], arr[i]);
//		System.out.print(rmax[i]+" ");
	
	}
	
	for(int i=1;i<arr.length-1;i++)
	{
		res+=Math.min(lmax[i], rmax[i])-arr[i];
	}
	return res;
}

//	Brute Force- find lmax,rmax for each element i then we can calculate min(lmax,rmax)-arr[i] for each element i.
//	Efficient method- per find lamx,and rmax for each element and apply same formula as in Brute force.
//	lmax[],rmax[]
	private static int maximumValoume(int[] arr) {
		// TODO Auto-generated method stub
		int lmax=0,rmax=0,res=0;
		for(int i=1;i<arr.length-1;i++)
		{
			lmax=arr[i];
			for(int j=0;j<i;j++)
			{
				lmax=Math.max(lmax, arr[j]);
			}
			rmax=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				rmax=Math.max(rmax, arr[j]);
			}
			res=res+Math.min(rmax, lmax)-arr[i];
			
		}
		return res;
	}

}
