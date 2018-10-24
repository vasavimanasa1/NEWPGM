package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args)
	{
		int a[]=new int[6];
		a[0]=4;
		a[1]=5;
		a[2]=6;
		a[5]=9;
		//printing static array data
		System.out.println("Data in static array");
		for(int j=0;j<a.length;j++)
		System.out.println(a[j]);
		
		//Using ArrayList
		//Size is dynamic for ArrayList
		
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		//Printing the size of arraylist
		System.out.println("The size of the arraylist a1 is::"+a1.size());
		
		a1.add(400);
		a1.add(100);
		a1.add("manasa");
		a1.set(2, 3000);
		//a1.add("manasa");
		System.out.println("After adding two more values The size of the arraylist a1 is::"+a1.size());
		System.out.println("The size of the arraylist a1 is::"+a1.lastIndexOf("manasa"));
		//Printing arraylist values.....
		//We use get() method to print all values in arraylist
		System.out.println("************************");
		for(int k=0;k<a1.size();k++)
		{
			System.out.println(a1.get(k));
		}
	//Using generics......
		System.out.println("*******Using generics integerArraylist*****");
		ArrayList<Integer> a2=new ArrayList();
		a2.add(1);
		a2.add(2);
		a2.add(3);
		System.out.println("The size of Integer arrayList is::"+a2.size());
		a2.add(4);
		a2.add(5);
		System.out.println("After adding two more values the  size of the arraylist a1 is::"+a2.size());
		System.out.println("####Printing Integer Arraylist Values####");
		for(int k=0;k<a2.size();k++)
		{
		   System.out.println(a2.get(k));
		}
	//Using generic Strings
		
		System.out.println("***Using String ArrayList");
		ArrayList<String> a3=new ArrayList();
		a3.add("Manasa");
		a3.add("Krishna");
		a3.add("Arjun");
		System.out.println("The size of String arraylist is::"+a3.size());
		a3.add("Babu");
		System.out.println("After adding one more The size of the arraylist a1 is::"+a3.size());
		
		System.out.println("Generic string arraylist is....");
		for(int k=0;k<a3.size();k++)
		{
			System.out.println(a3.get(k));
		}
		ArrayList<Employee> ae=new ArrayList();
		Employee e1=new Employee("Yamini",1,120000,"Hyd");
		Employee e2=new Employee("Anu",2,130000,"Bang");
		Employee e3=new Employee("Venkat",3,145000,"Pune");
		
		ae.add(e1);
		ae.add(e2);
		ae.add(e3);
		Iterator<Employee> it=ae.iterator();
		while(it.hasNext())
		{
			Employee em=it.next();
			System.out.println(em.name);
			System.out.println(em.eid);
			System.out.println(em.sal);
			System.out.println(em.loc);
		}
		
	
		ArrayList<String> a4=new ArrayList();
		a4.add("Selenium");
		a4.add("QTP");
		a4.add("QT");
		System.out.println("Before addall method a4 method contains" );
		for(int i=0;i<a4.size();i++)
		{
			System.out.println(a4.get(i));
		}
		
		ArrayList<String> a5=new ArrayList();
		a5.add("OTIS");
		a5.add("schneider");
		System.out.println("Before addall methoda5 is::");
		
		for(int i=0;i<a4.size();i++)
		{
			System.out.println(a4.get(i));
		}
		a4.addAll(a5);
		System.out.println("After complting");
		
		
	}

}
