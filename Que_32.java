package Home.Work;

import java.util.Arrays;

// 32) Write a program of how to pass array as a parameter to method in java?
public class Que_32 
{
	void get(int a[])
	{
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		
		Que_32 q = new Que_32();
		q.get(a);

	}

}
