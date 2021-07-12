package Home.Work;

import java.util.Arrays;

// 12) Write a program to put even and odd elements of array in two separate arrays.
public class Que_12
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(a));
		
		//using 2 saprate Array
		
		int even[] = new int[5];
		int odd[] = new int[5];
		int eve=0,od = 0;
		
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] % 2 == 0)
			{	
				even[eve] = a[i];
				eve++;
			}
			else
			{
				odd[od] = a[i];
				od++;
			}
		}
		System.out.println("Even Nos : ");
		for(int x:even)
			System.out.print(" "+x);
		System.out.println();
		System.out.println("Odd Nos : ");
		for(int x:odd)
			System.out.print(" "+x);
		
		//in singal Array 
//		System.out.println("Even Nos : ");
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i] % 2 ==  0)
//			{
//				System.out.print(" "+a[i]);
//			}
//		}
//		System.out.println("\n Odd Nos : ");
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i] % 2 ==  1)
//			{
//				System.out.print(" "+a[i]);
//			}
//		}
	}

}
