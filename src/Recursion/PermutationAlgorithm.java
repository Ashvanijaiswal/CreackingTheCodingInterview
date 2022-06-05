package Recursion;

public class PermutationAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllPermuation("ABC",0);
		

	}

	private static void printAllPermuation(String s,int i) {
		// TODO Auto-generated method stub
		
		for(int j=i;j<s.length();j++)
		{
			swap(s,i,j);
			printAllPermuation(s, i+1);
			swap(s,i,j);
		}
	}

	private static void swap(String s, int i, int j) {
		// TODO Auto-generated method stub
		
	}
	

}
