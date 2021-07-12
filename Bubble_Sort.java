package Home.Work;
// 7) Write a program sort array elements in ascending order using bubble sort.
public class Bubble_Sort 
{
	public static void main(String[] args) 
	{
		int a[] = {8,3,6,2,5,7,1,4};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j =0;j<a.length-1;j++ )
			{
				if(a[j] > a[j+1])
				{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			
			}
		}
		for(int x:a)
			System.out.print(" "+x);
	}

}
