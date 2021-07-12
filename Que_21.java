package Home.Work;

import java.util.Scanner;

// 21) Write a program to print the addition of two matrices.
public class Que_21 
{
	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);
		  System.out.println(" Enter size of Array : ");
		  int n = sc.nextInt();
		  int a[][] = new int[n][n];
		  System.out.println(" Enter A-Array Elements : ");
		  for(int i = 0;i<n;i++)
		  {
			  for(int j=0;j<n;j++)
			  {
				  a[i][j] = sc.nextInt();
			  }
		  }
		  System.out.println("-----------A-Array----------");
		  for(int i = 0;i<n;i++)
		  {
			  for(int j = 0;j<n;j++)
			  {
				  System.out.print(" "+a[i][j]);
			  }
			  System.out.println();
		  }
		  
		  int b[][] = new int[n][n];
		  System.out.println(" Enter B-Array Elements : ");
		  for(int i = 0;i<n;i++)
		  {
			  for(int j=0;j<n;j++)
			  {
				  b[i][j] = sc.nextInt();
			  }
		  }
		  System.out.println("-----------B-Array----------");
		  for(int i = 0;i<n;i++)
		  {
			  for(int j = 0;j<n;j++)
			  {
				  System.out.print(" "+b[i][j]);
			  }
			  System.out.println();
		  }
		  int c[][] = new int[n][n];
		  for(int i=0;i<n;i++)
		  {
			  for(int j = 0;j<n;j++)
			  {
				  c[i][j] = a[i][j]+b[i][j];
			  }
		  }
		  System.out.println("Addition of 2 Matrix : ");
		  for(int i =0;i<n;i++)
		  {
			  for(int j=0;j<n;j++)
			  {
				  System.out.print(" "+c[i][j]);
			  }
			  System.out.println();
		  }

	}

}
