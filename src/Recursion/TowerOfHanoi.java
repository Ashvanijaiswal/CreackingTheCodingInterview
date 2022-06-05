package Recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char source='A';
		char target='C';
		char aux='B';
		printAllMoves(3,source,aux,target);

	}

	private static void printAllMoves(int n, char source, char aux, char target) {
		// TODO Auto-generated method stub
		if(n==1)
		{
			System.out.println("Move disk "+"1"+" from "+source+" to "+ target);
			return ;
		}
		printAllMoves(n-1, source, target, aux);
		System.out.println("Move disk "+n+" from "+source+" to "+ target);
		printAllMoves(n-1,aux,source, target);
		
	}

}
