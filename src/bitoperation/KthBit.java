package bitoperation;

public class KthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13,k=3;
//		Using right shift
		if(((n>>k-1)&1)==1)
		{
			System.out.println("Set");
		}
		else
			System.out.println("Unset");
//		Second Method left shift
		if(((n<<k-1)&n)!=0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
