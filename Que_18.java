package Home.Work;

import java.util.Arrays;

/*18) Write a program to separate even and odd numbers of an given array of integers.
 *  Put all even numbers first, and then odd numbers.
 * 
 */
public class Que_18 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(a));
		
//		System.out.println("Even nos : ");
//		for(int i = 0;i<a.length;i++)
//		{
//			if(a[i]%2 == 0)
//				System.out.print(" "+a[i]);
//		}
//		System.out.println();
//		System.out.println("Odd Nos : ");
//		for(int i = 0;i<a.length;i++)
//		{
//			if(a[i]%2 == 1)
//				System.out.print(" "+a[i]);
//		}
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				for(int j = 0;j<a.length;j++)
				{
					if(a[j] %2 !=0)
					{
						int t = a[i];
						a[i] = a[j];
						a[j] = t;
					}
				}
			}
		}
		for(int x:a)
			System.out.print(" "+x);

			
	}

}
