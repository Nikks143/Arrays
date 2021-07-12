package Home.Work;
// 8) Write a program to find the second largest element in an array
public class Que_8 
{
	public static void main(String[] args) 
	{
		int a[] = {8,3,6,2,5,7,1,4};
		
		int max = a[0];
		int smax = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] > smax && a[i] != max)
			{
				smax = a[i];
			}
		}
		System.out.println("max : "+max);
		System.out.println("samx : "+smax);
		
	}

}
