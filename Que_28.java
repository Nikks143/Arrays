package Home.Work;

/*
 * 28) Write a program or function to find saddle point of a matrix. Your program should take input matrix from the user, display the matrix and find the saddle point of that matrix. 
 * Saddle point of a matrix is an element in the matrix which is smallest in its row and largest in its column. A matrix can have many or no saddle points. For example,
		6	3   1
		9	7	8
		2	4	5
In this matrix, 7 is the saddle point.
 Because it is the smallest in its row (2nd row) and largest in its column (2nd column).
 */
public class Que_28 
{
	public static void main(String[] args) 
	{
		System.out.println("-------------type 1------------------");
		int a[][] = {{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a.length;j++)
			{
				boolean small = true;
				boolean large = true;
				for(int k = 0;k<a.length;k++)
				{
					if(a[i][j] > a[i][k])
						small = false;
					if(a[i][j] < a[k][j])
						large = false;
				}
				if(small && large)
					System.out.println("Saddle Point : "+a[i][j]);
			}
		}
		
		System.out.println("------------type 2----------------");
		
		int col_max = 0;
		for(int i = 0;i<a.length;i++)
		{
			int  row_min = a[i][0];
			int col = 0;
			for(int j = 1;j<a.length;j++)
			{
				if(a[i][j] < row_min)
				{
					row_min = a[i][j];
					col = j;
				}
			}
			for(int k = 0;k<a.length;k++)
			{
				if(a[k][col] > row_min)
					break;
				else
					col_max = row_min;
			}
		}
		if(col_max != 0)
			System.out.println("Siddle point : "+col_max);
		else
			System.out.println(" no Siddle point ");

	}

}
