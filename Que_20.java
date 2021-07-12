package Home.Work;

public class Que_20 
{
	public static void main(String[] args) 
	{
		int a[][] = {{10,20,30,40},
					{10,20,30,40},
					{10,20,30,40},
					{10,20,30,40}};
		int sum = 0 ,cnt=0,avg = 0;
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i != 0 && i!=a.length-1 && j!=0 && j!=a.length-1)
				{
					sum = sum + a[i][j];
					cnt++;
					avg = sum/cnt;
				}
			}
		}
		
		System.out.println("Avarage : "+avg);
		System.out.println("Sum = "+sum);
		

	}

}
