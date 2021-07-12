package Home.Work;

import java.util.Arrays;

public class Que_31 {

	public static void main(String[] args) 
	{
		int a[][] = {{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		int sum = 0;
		for(int i = 0;i<a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(i == j || i+j==2)
				{
					//System.out.print(a[i][j]+" ");
					sum = sum + a[i][j];
					if(i != a.length)
						System.out.print(a[i][j]+"+");
					else
						System.out.print(a[i][j]);
				}
			}
		}
		System.out.println(" = "+sum);

	}

}
