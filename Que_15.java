package Home.Work;
//15) Write a program to print all the LEADERS in the array.
public class Que_15 
{
	public static void main(String[] args) 
	{
		int a[] = {5,3,2,8,4,6};
		
		for(int i = 0;i<a.length;i++)
		{
			int j ;
			for( j = i+1;j<a.length;j++)
			{
				if(a[j] > a[i])
					break;
			}
			if(j == a.length)
				System.out.println(" "+a[i]);
		}
	

	}

}
