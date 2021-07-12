package Home.Work;

import java.util.Scanner;

//19) Write a program to display data in 2D array.
public class Que_19 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int n = sc.nextInt();
		
		int a[][] =  new int[n][n];
		System.out.println("Enter Array Element : ");
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Display 2D-Array element : ");
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----type 2--------");
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Display 2D-Array element : ");
		for(int i = 0;i<b.length;i++)
		{
			for(int j = 0;j<b.length;j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		

	}

}
