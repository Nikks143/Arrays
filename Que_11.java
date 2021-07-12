	package Home.Work;

import java.util.Arrays;

//11) Write a program to remove the duplicate elements of a given array and 
//    return the new length of the array.
public class Que_11 {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,2,1,3,4,5};
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(a));
		int cnt = 0;
		for(int i = 0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					cnt++;
					break;
				}
			}
		}
		System.out.println("Count of Duplicate Element : "+cnt);
		
		int b[] = new int[a.length-cnt];
		int index = 0;
		for(int i=0;i<a.length;i++)
		{
			int k = 0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i] == b[j])
				{
					k++;
				}
			}
			if(k == 0)
			{
				b[index++] = a[i];
			}
		}
		System.out.println(" After Removing Duplicates element of Array is : ");
		for(int x : b)
			System.out.print("  "+x);
	
	}
}
