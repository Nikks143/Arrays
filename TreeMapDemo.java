 package Home.Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
//heterogeneous value allowed key not allowed
//duplicates not allowed
//insertion order sorted on key
//null key not allowed null value allwed
public class TreeMapDemo {

	public static void main(String[] args) {
	TreeMap t1=new TreeMap();

	t1.put(10, "hello");
	t1.put(11, null);
	t1.put(20, "hii");
	//t1.put(null,56);
	t1.put(10, 7.8);
	t1.put(8, "abc");
	
	System.out.println(t1);
	
	Map.Entry e= t1.firstEntry();
	
	System.out.println(e.getKey()+" "+e.getValue());
Map.Entry e1= t1.lastEntry();
	
	System.out.println(e1.getKey()+" "+e1.getValue());
	
	
	System.out.println(t1.ceilingEntry(12).getKey()+" "+t1.ceilingEntry(12).getValue());//>=
	System.out.println(t1.ceilingKey(12));
	
	System.out.println(t1.floorEntry(12));//<=
	
	System.out.println(t1.higherKey(11));//>
	System.out.println(t1.lowerEntry(12));
	
	SortedMap s=t1.headMap(12);
	System.out.println(s);
	
	s=t1.tailMap(12);
	System.out.println(s); 
	
	System.out.println(t1.subMap( 8,11));
	System.out.println(t1.subMap(8,false,11,false));
	
	HashMap h1=new HashMap();
	h1.putAll(t1);
	System.out.println(h1);
	
		
	TreeMap t2=new TreeMap();
	t2.put(2, "Hello");
	t2.put(1, "abc");
	
	t2.put(4, "xyz");
	
	t2.put(23, 23.8);
	
	t2.put(20, "bye");
	
	System.out.println(t2);
	Set s3=t2.keySet();
	System.out.println("-----Object Array------");
	
	Object  o[]=s3.toArray();
	for(Object x:o)
		System.out.println(x);
	System.out.println("====in descending order without using method");
	for(int i=0;i<o.length;i++)
	{
		for(int j=i+1;j<o.length;j++)
		{
			if((int)o[i]<(int)o[j])
			{
				int temp=(int)o[i];
				o[i]=o[j];
				o[j]=temp;
			}
		}
	}
	for(Object x:o)
		System.out.println(x);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//TreeSet ts=new TreeSet(s3);
	//System.out.println(ts);
	//ArrayList a1=new ArrayList(s3);
//	Collections.sort(a1,new KeyComparator());
	//System.out.println(a1);
	
	}

}
