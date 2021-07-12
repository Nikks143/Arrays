package Home.Work;
//23) Write a program to display outer elements of a matrix. i.e 2d array of size 6 x 6.
public class Que_23 
{
	public static void main(String[] args) 
	{
		int a[][] = {{10,20,30,40},
					{10,20,30,40},
					{10,20,30,40},
					{10,20,30,40}};
		int cnt = 0;
		for(int i = 0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==0 || i==a.length-1 || j==0 || j==a.length-1)
				{
					cnt++;
					System.out.print(" "+a[i][j]);
				}
			}
		}
		
//		for(int x:)
//			System.out.print(x);

	}

}
