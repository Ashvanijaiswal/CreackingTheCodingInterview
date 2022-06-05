package ArrayAndString;

public class FrequencyInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFrequency(new int[] {40,50,50,50});

	}

	private static void printFrequency(int[] arr) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
				continue;
			}
			System.out.println(arr[i]+" frequency is "+count);
			count=1;
		}
		System.out.println(arr[arr.length-1]+" frequency is "+count);
		
	}

}
