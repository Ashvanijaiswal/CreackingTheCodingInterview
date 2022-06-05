package ArrayAndString;

public class PrintMatrixSpiral {

	private static void printSpiral(int[][] matrix, int M, int N) {
		
		for(int i=0;i<=M/2;i++ )
		{
			printTop(matrix,i,M,N);
			printRight(matrix,i,M,N);
			printBottom(matrix,i,M,N);
			printLeft(matrix,i,M,N);
		}
		
		
	}

	
	private static void printLeft(int[][] matrix, int i,int M,int N) {
		// TODO Auto-generated method stub
		for(int k=M-i-2;k>i;k--)
		System.out.print(matrix[k][i]+" "); 
		
		
	}


	private static void printBottom(int[][] matrix, int i,int M,int N) {
		// TODO Auto-generated method stub
		for(int k=N-1-i;k>i;k--)
		System.out.print(matrix[M-i-1][k-1]+" ");
		
	}


	private static void printRight(int[][] matrix, int i,int M,int N) {
		// TODO Auto-generated method stub
		for(int k=i+1;k<M-i;k++)
		System.out.print(matrix[k][N-i-1]+" ");
		
	}


	private static void printTop(int[][] matrix, int i,int M,int N) {
		// TODO Auto-generated method stub
		for(int k=i;k<N-i;k++)
		System.out.print(matrix[i][k]+" ");
		
		
	}


	public static void main(String[] args) {
		
		int [][]matrix= {
				{2,3,4,11},
				{4,5,6,12},
				{7,8,9,13},
				{14,15,16,17}
			
		};
		
		printSpiral(matrix,4,4);
		// TODO Auto-generated method stub

	}

	

}
