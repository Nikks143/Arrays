package Home.Work;
// 14) Write a program to test the equality of two arrays
public class Que_14 {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
		int b[] = {1,2,3,4,5,6};
		int cnt = 0;
		if(a.length == b.length)
		{
			for(int i =0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i] == b[j])
						cnt++;
				}
			}
		}
		if(cnt == a.length)
			System.out.println("Both Array are Equal  ");
		else
			System.out.println("not Equal ");
	}

}
