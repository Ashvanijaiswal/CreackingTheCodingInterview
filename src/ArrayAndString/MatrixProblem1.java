package ArrayAndString;

public class MatrixProblem1 {

	public static void main(String[] args) {
		int [][]matrix= {	{3,4,5},
				{6,7,0},
				{2,8,9}
						};
		
		boolean row[]=new boolean[matrix.length];
		boolean column[]=new boolean[matrix.length];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(matrix[i][j]==0)
				{
					row[i]=true;
					column[j]=true;
				}
			}
		}
		
//	nullyfy column
		for(int i=0;i<column.length;i++)
		{
			if(column[i])
			{
				nullyfyColumn(matrix,i);
			}
		}
		
//		nullyfy row
		for(int i=0;i<3;i++)
		{
			if(row[i])
			{
				nullyfyRow(matrix,i);
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(
					);
		}

	}

	private static void nullyfyRow(int[][] matrix, int i) {
		// TODO Auto-generated method stub
		for(int j=0;j<3;j++)
		{
			matrix[i][j]=0;
		}
	}

	private static void nullyfyColumn(int[][] matrix, int i) {
		// TODO Auto-generated method stub
		for(int j=0;j<3;j++)
		{
			matrix[j][i]=0;
		}
		
	}
	
	

}
