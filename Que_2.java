package Home.Work;

import java.util.Arrays;
import java.util.Scanner;

public class Que_2 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(a));
		boolean flag  = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an elemrnt to checked : ");
		int n = sc.nextInt();
		
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] == n)
				flag = true;
		}
		if(flag == true)
			System.out.println(n+"  Element is Present in array  ");
		else
			System.out.println(n+"  element is not Present in Array ");
	}
}
