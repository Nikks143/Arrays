package Home.Work;
// 10) Write a program to find maximum element in a matrix.
public class Que_10 
{
	public static void main(String[] args) 
	{
		int a[][] = {{10,2,3},{4,1,6},{7,8,9}};
		
		int max = a[0][0];
		int min = a[0][0];
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(max < a[i][j])
					max = a[i][j];
				if(min > a[i][j])
					min = a[i][j];
			}
		}
		System.out.println("Maximum Element in matrix : "+max);
		System.out.println("Minimum element in Matrix : "+min);
	}

}
