package Home.Work;

import java.util.Scanner;

/*
 * 25) Write a program to create Student class having rollno, name, marks. 
 * Create 10 objects .
 *  Using Array of Objects display information of student who got highest marks .
 */
public class Que_25_Student 
{
	int roll,mks;
	String name;

	public Que_25_Student(int roll, int mks, String name) 
	{
		super();
		this.roll = roll;
		this.mks = mks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Que_25_Student [roll=" + roll + ", mks=" + mks + ", name=" + name + "]";
	}

	public int getmks()
	{
		return mks;
	}
	public static void main(String[] args) 
	{
		Que_25_Student a[] = new Que_25_Student [3];
		Scanner sc= new Scanner(System.in);
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Roll no , Marks , Name  : ");
			a[i] = new Que_25_Student(sc.nextInt(),sc.nextInt(),sc.next());
		}
		int max_mks = a[0].getmks();
		
		for(int i = 1;i<a.length;i++)
		{
			if(max_mks < a[i].getmks())
				max_mks = a[i].getmks();
		}
		for(int i = 0;i<a.length;i++)
		{
			if(a[i].getmks() == max_mks)
				System.out.println(a[i].toString());
		}
	}
	
}
//https://www.linkedin.com/in/nikhil-gurav-2aba00162