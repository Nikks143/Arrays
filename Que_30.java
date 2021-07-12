package Home.Work;

public class Que_30 {

	public static void main(String[] args) 
	{
		int a[] = {5,1,3,4,7};
		int sum = 12;
		for(int i = 0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				for(int k = j+1;k<a.length;k++)
				{
					if(sum > (a[i] + a[j] + a[k]))
					{
						System.out.println(a[i]+","+a[j]+","+a[k]);
					}
				}
				
			}
		}

	}

}
