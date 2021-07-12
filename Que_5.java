package Home.Work;

import java.util.Arrays;

public class Que_5 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7};
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(a));
		
		//method--1
//		for (int i = 0,j=a.length-1;i<a.length/2;i++,j--) 
//		{
//			int t = a[j];
//			a[j] = a[i];
//			a[i] = t;
//		}
//		for(int x : a)
//			System.out.print(x);
//		
		//method--2
//		for(int i = 0;i<a.length;i++)
//		{
//			for(int j = i+1;j<a.length;j++)
//			{
//				if(a[i] < a[j])
//				{
//					int t = a[j];
//					a[j] = a[i];
//					a[i] = t;
//				}
//			}
//		}
//		for(int x:a)
//			System.out.print(" "+x);
		
		//method--3
		for(int i = a.length-1;i>=0;i--) 
		{
			System.out.print(" "+a[i]);
		}

	}

}
