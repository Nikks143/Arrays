package Home.Work;

import java.util.Arrays;

/*
 * 17) Write a program to replace 0’s with 1’s.
 *  e.g array is [0,1,0,1,0,1,0,1,0,1,0,1,0].
 */
public class Que_17
{
	public static void main(String[] args) 
	{
		int a[] = {0,1,0,1,0,1,0,1,0,1};
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(a));
		
//		for(int i = 0;i<a.length;i++)
//		{
//			for(int j = i+1;j<a.length;j++)
//			{
//				int t = a[i];
//				a[i] = a[j];
//				a[j] = t;
//			}
//		}
//		for(int x:a)
//			System.out.print(" "+x);
		
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]==0)
				a[i]=1;
			else
				a[i]=0;
		}
		for(int x:a)
			System.out.print(" "+x);
	}

}
