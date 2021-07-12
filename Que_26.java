package Home.Work;
/*
 * 26) Given an integer array and size of subarray,find the first subarray with leasts average in single loop. 
 * Print first index of subarray and average. (Mindstix)
	Method signature Find Firstsub(int arr[], int arr_len, int sub_arr_len)
{
//Your code
}
Example:
Input:
int arr={3,7,90,20,5,50,40}, k=3
Find Firstsub(arr,7 Output:
Index:3 Avg:25
 */
public class Que_26 
{
	//void Firstsub(int a[],int a_len,int sub_a_len)
//	{
//		int index = 0;
//		double avg = (a[0] + a[1] + a[2]) / 3 ;
//		int i,j,k;
//		for(i=0,j=i+1,k=i+2;i<a_len && j<a_len && k<a_len;i++,j++,k++)
//		{
//			double avarage = (a[i] + a[j] + a[k]) / sub_a_len;
//			
//			if(avg > avarage)
//			{
//				avg = avarage;
//				index = i;
//			}
//		}
//		System.out.println("Avg : "+avg);
//		System.out.println("Index : "+index);
//	}
	public static void main(String[] args) 
	{
		int a[] = {3,7,90,20,5,50,40};
//		int a_len = 7;
//		
//		Que_26 q = new Que_26();
//		q.Firstsub(a, a_len, 3);
		
		int ind = 0;
		int  avg = 0,minavg = 1000;
		
		for(int i = 0;i<a.length-2;i++)
		{
			avg = (a[i] + a[i+1] + a[i+2]) / 3;
			
			if(avg < minavg)
			{
				minavg=avg ;
				ind = i;
			}
		}
		System.out.println("Avarage : "+minavg);
		System.out.println("Index : "+ind);

	}

}
