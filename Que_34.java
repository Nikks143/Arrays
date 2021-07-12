package Home.Work;
// 34) Write a program to merge two arrays into third array.
public class Que_34 
{

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		int c[] = new int[a.length + b.length];
		
		for(int i = 0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		int k = a.length;
		for(int j = 0;j<b.length;j++)
		{
			c[k] = b[j];
			k++;
		}
		for(int x:c)
			System.out.print(x+" ");
	}

}
