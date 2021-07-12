package Home.Work;

import java.util.Arrays;
import java.util.Scanner;

// 3) Write a program to remove a specific element from an array
public class Que_3 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7};
		System.out.println("Original  Array :");
		System.out.println(Arrays.toString(a));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to be remove from Array : ");
		int n = sc.nextInt();
		
		System.out.println("After removing Element  : ");
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] == n)
			{
				a[i] = ' ';
			}
			if(a[i] != ' ')
				System.out.print("  " +a[i]);
		}
		
	}

}
