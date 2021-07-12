
package Home.Work;
/*
 * 27) Given 2 character arrays s1 and s2 and another empty character array s3. 
 * Populate s3 by interleaving characters from both s1 and s1(Mindstix) Method signature
Void interleaved (char[] s1, char[]s2, char[]s1, int s1_len, int s2_len)
{
// Your Code
}
Example:
S1={‘a’,’b’,’c’,’d’};
S2={‘w’,’x’,’y’,’z’};
Output:
S={‘a’,’w’’b’,’x’’c’,’y’,’d’,’z’}.
 */
public class Que_27 
{
	public static void main(String[] args) 
	{
		char s1[] = {'w','x'};
		char s2[] = {'a','b','c','d'};
		char s[] =  new char[s1.length + s2.length];
		
		int index1 = 0, index2 = 0;
		int t = s1.length-s2.length-1;
		for(int i = 0;i<s.length;i++)
		{
			if(index1 < s1.length)
			{
				s[i] = s1[index1];
				index1++;
				if(index1 < s1.length-t)
					i++;
				else if(index2 < s2.length-t)
					i++;
			}
			if(index2 < s2.length)
			{
				s[i] = s2[index2];
				index2++;
			}
		}
		for(char x : s)
			System.out.print(x+" ");
	}

}
