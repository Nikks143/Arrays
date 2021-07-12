package Home.Work;

import java.util.Arrays;
import java.util.Scanner;

// 1) Write a program to find the index of an array element.
public class Que_1 
{
	public static void main(String[] args) 
	{
		int a[] = {4,5,6,7};
		System.out.println("Array element : ");
		System.out.println(Arrays.toString(a));
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element ");
		int n = sc.nextInt();
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] == n)
				System.out.println("index value of an "+n+" element is :"+i);
		}
	}

}

