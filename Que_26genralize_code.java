package Home.Work;

import java.util.Scanner;

public class Que_26genralize_code 
{
	public static void main(String[] args) 
	{
		int a[] = {3,7,90,20,5,50,40};
//		double min = 10000;
//		int index = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter the value of SubArray : ");
//		int k = sc.nextInt();
//		for(int i = 0;i < a.length-(k-1);i++)
//		{
//			double sum = 0;
//			if(i<(k+i))
//			{
//				for(int j = i;j<(k+i); j++)
//				{
//					sum += a[j];
//				}
//			}
//			double avg = (sum) / k;
//			if(min>avg)
//			{
//				min=avg;
//				index=i;
//			}
//		}
//		System.out.println("index : "+index);
//		System.out.println("Avarage : "+min);
		
		double min = 1000;
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sub array len : ");
		int k = sc.nextInt();
		
		for (int i = 0; i < a.length-(k-1); i++) 
		{
			double sum = 0;
			if(i<(k+i))
			{
				for (int j = i; j < (k+i); j++) 
				{
					sum += a[j];
				}
			}
			double avg = sum /k;
			if(min > avg)
			{
				min = avg;
				index = i;
			}
		}
		System.out.println("index : "+index);
		System.out.println("Avg : "+min);
	}

}
