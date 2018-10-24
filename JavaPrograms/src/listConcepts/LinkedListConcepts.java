package listConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("testing");
	ll.add("selenium");
	ll.add("qtp");
	System.out.println(ll);
	System.out.println("Using for loop************");
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	ll.addFirst("Job");
	ll.addLast("done");
	ll.remove(3);
	System.out.println(ll);
	System.out.println(ll.getLast());
	System.out.println("through index");
System.out.println(ll.get(0));
	
	System.out.println("Using for each loop************");
	for(String str:ll)
	{
		System.out.println(str);
	}
	System.out.println("Using itarator********");
	
	Iterator<String> it=ll.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("Using while loop$$$$$$$$$$$$$$$$$$$$");
	int num=0;
	while(ll.size()>num)
	{
		System.out.println(ll.get(num));
		num++;
	}
	
	}

}
