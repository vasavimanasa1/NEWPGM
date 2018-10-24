package listConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept 
//extends Employee
{

	public static void main(String[] args) 
	{
	int a[] =new int[3];
	a[0]=1;
	a[1]=2;
	a[2]=3;

	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	Object obj[]=new Object[5];
	obj[0]="manasa";
	obj[1]=1;
	obj[2]='m';
	for(int k=0;k<obj.length;k++)
	{
		System.out.println(obj[k]);
	}
	
	System.out.println("*****Using arrayList");
	ArrayList al=new ArrayList();
	al.add(1);
	al.add(200);
	al.add(400);
	al.add("manasa");
	al.add(400);
	al.add(600);
	
	System.out.println(al.size());
	System.out.println("$$$$$$$$$$$$$$$");
	System.out.println(al);
	for(int p=0;p<al.size();p++)
	{
		System.out.println(al.get(p));
	}
	System.out.println("*****");
	System.out.println(al.get(3));
	
	//********************************************Generics
	ArrayList<String> ars=new ArrayList<String>();
	System.out.println("*****************generics******");
	ars.add("Manasa");
	ars.add("arjun");
	ars.add("Krishna");
	ars.set(0, "Manasa thallapaka");
	System.out.println(ars);
	for(int h=0;h<ars.size();h++)
	{
			System.out.println(ars.get(h));
	}
	
	System.out.println("***************");
	ars.addAll(ars);
	System.out.println(ars);
	
	
	
	System.out.println("Employee details are##****");
	
	
	Employee e1=new Employee("manasa","Testing",1234);
	Employee e2=new Employee("krishna","Mech",12345);
	Employee e3=new Employee("Babu","Testing",123456);
	ArrayList<Employee> are=new ArrayList<Employee>();
	are.add(e1);
	are.add(e2);
	are.add(e3);
	Iterator<Employee> i=are.iterator();
	while(i.hasNext())
	{
		Employee e=i.next();
		System.out.println(e.name);
		System.out.println(e.dep);
		System.out.println(e.eid);
	}
	
	ArrayList<String> ar5=new ArrayList<String>();
	
	ar5.add("Gainsight");
	ar5.add("codepro");
	ar5.add("QT");
	System.out.println("ar5 info is*********");
	ar5.addAll(ar5);
	for(int i1=0;i1<ar5.size();i1++)
	{
		System.out.println(ar5.get(i1));
		
	}
	System.out.println("****************");
	ArrayList<String> ar6=new ArrayList<String>();
	ar6.add("Btech");
	ar6.add("Mtech");
	
	
	ar5.addAll(ar6);
	for(int m=0;m<ar5.size();m++)
	{
	System.out.println(ar5.get(m));
	}
	}

}
