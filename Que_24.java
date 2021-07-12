package Home.Work;
//24) Write a program to rotate an array to the left.
import java.util.Arrays;

public class Que_24 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		System.out.println("Original Array : ");
		System.out.println(Arrays.toString(a));
		
//		int temp = a[0];
//		for(int i = 0;i<a.length-1;i++)
//		{
//			a[i] = a[i+1];
//		}
//		a[a.length-1]=temp;
//		System.out.println("Rotate Laft : ");
//		for(int x:a)
//			System.out.print(" "+x);
		
		System.out.println();
		System.out.println("Rotate Right : ");
		int t = a[a.length-1];
		
		for(int i = a.length-2;i>=0;i--)
		{
			a[i+1] = a[i];
		}
		a[0] = t;
		for(int x :a)
			System.out.print(x+" ");
	}

}
