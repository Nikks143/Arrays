package Home.Work;
/*
 * 35) Find the minimum distance between 2 seeds( m and n) provided in an integer array arr[] of given length. Array can contain duplicates and negative integers. Assume that both m and n are different and be present in arr[].
Method Signatue
FindMinDist(int arr[],int arr_length,int m,int n)
{
//your code here
}
Constraints:
Do not use any additional data structures. You may use as many as primitive variables
 */
public class Que_35 
{
	public static void main(String[] args) 
	{
//		int a[] = {1,2,3,4,1,2,1,-1,5,3,-2,-1,4,2,1,-1};
//		
//		int m = 1;
//		int n = -1;
//		int min1 = Integer.MAX_VALUE;
//		int min2 = Integer.MAX_VALUE;
//		
//		for(int i = 0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i] == m && a[j] == n)
//				{
//					min1 = j-i;
//					System.out.println(min1);
//				}
//				if(min1 < min2)
//				{
//					int t = min1;
//					min1 = min2;
//					min2 = t;
//				}
//			}
//		}
//		System.out.println("Minimum Distance : "+min2);
		
	
		int b[] = {1,2,3,4,-1,-2,-3,-4,1,2,3,4,-1,-2};
		int m = 1;
		int n = -1;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = i+1; j < b.length; j++) 
			{
				if(b[i] == m  && b[j] == n)
				{
					min1 = j-i;
					System.out.println(min1);
				}
				if(min1 < min2)
				{
					int t = min1;
					min1 = min2;
					min2 = t;
				}
			}
		}
		System.out.println("Minimum distance : "+min2);
	}

}
