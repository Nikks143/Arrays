package Home.Work;
//22) Write a program to calculate the subtraction and multiplication of two matrices entered by the user.
import java.util.Scanner;

public class Que_22 {

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
				  c[i][j] = a[i][j] - b[i][j];
			  }
		  }
		  System.out.println("Substraction of 2 Matrix : ");
		  for(int i =0;i<n;i++)
		  {
			  for(int j=0;j<n;j++)
			  {
				  System.out.print(" "+c[i][j]);
			  }
			  System.out.println();
		  }
		  for(int i= 0;i<n;i++)
		  {
			  for(int j = 0;j<n;j++)
			  {
				  for(int k = 0;k<n;k++)
				  {
					  c[i][j] += a[i][k] * b[k][j];
				  }
			  }
		  }
		  System.out.println("Multiplication of Array : ");
		  for(int i = 0;i<n;i++)
		  {
			  for(int j = 0;j<n;j++)
			  {
				  System.out.print(" "+c[i][j]);
			  }
			  System.out.println();
		  }

	}

}
