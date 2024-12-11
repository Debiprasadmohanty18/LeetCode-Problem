package Array;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
			
		int[][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9}	
				
//				{1,1,1,1},
//				{1,1,1,1},
//				{1,1,1,1},
//				{1,1,1,1}
				
//				{5}
		};
		
		System.out.println(diagonalSum(mat));

	}
	
	static int diagonalSum(int[][] mat) 
	{
		int j = mat.length-1;
		int sum = 0;
        for(int i=0;i<mat.length;i++)
        {
        	sum+=mat[i][i];
        	if((i+j == mat.length-1) && (i!=j))
        		sum += mat[i][j];
        	j--;
        }        
        
        return sum;
    }
	
//	Approach - 2
	
/*	
  	static int diagonalSum(int[][] mat) 
	{
		int sum = 0;
        for(int i=0;i<mat.length;i++)
        {
        	for(int j=0;j<mat.length;j++)
        	{
        		if(i == j || (i+j == mat.length-1))
        			sum += mat[i][j];
        	}
        }                
        
        return sum;
    }
*/
}
