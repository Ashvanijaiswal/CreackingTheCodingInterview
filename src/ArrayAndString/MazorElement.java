package ArrayAndString;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MazorElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anyindex=findMajority(new int[] {5,4,6,8,6,8,16,6});
		System.out.println(anyindex);
	}

	private static int findMajority(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> m=new HashMap();
//				{
//					public int compare(Integer a,Integer b)
//					{
//						return a>b?1:-1;
//					}
//				};
		for(int i=0;i<arr.length;i++)
		{
			if(!m.containsKey(arr[i]))
			{
				m.put(arr[i], 1);
				continue;
			}
			m.put(arr[i], m.get(arr[i])+1);
		}
		System.out.println(m);
		return 0;
	}

}
