package Home.Work;
//13) Write a program to create an array of its anti-diagonals from a given square matrix.
import java.util.Scanner;

public class Que_13 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int n = sc.nextInt();
		
		int a[][] = new int[n][n];
		System.out.println("Enter Elements Of Array : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original Array : ");
		for(int i = 0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Diagonals : ");
		for(int k = 0;k<=5;k++)
		{
			for(int i=0;i<n;i++)
			{
				for(int j = 0;j<a[i].length;j++)
				{
					if(i+j == k)
					{
						System.out.print(a[i][j]+" ");
					}
				}
			}
			System.out.println();
		}
		
		System.out.println("Anti-Diagonals : ");
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if(i == j || i+j == 2)
					continue;
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
