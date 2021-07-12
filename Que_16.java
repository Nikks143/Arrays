package Home.Work;

import java.util.Arrays;

//16) Write a program to get the difference between the largest and smallest values in an array of integers.
public class Que_16 
{
	public static void main(String[] args) 
	{
		int a[] = {5,3,6,2,4,1};
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(a));
		
		  for(int i = 0;i<a.length;i++) 
		  { 
			  for(int j = 0;j<a.length;j++) 
			  { 
				  if(a[i] < a[j])
				  {
					  int t = a[j]; 
					  a[j] = a[i]; 
					  a[i] = t; 
				  } 
			  } 
		  } 
		  System.out.println(" Sorted Array ");
		  for(int x:a)
		  System.out.print(" "+x);
		  System.out.println();
		  System.out.println("difference between the largest and smallest values in array is :");
		  System.out.println(a[a.length-1]-a[0]);
		 
	}

}
