package jAVA;

public class methods
{
	static int p=10;
	int q=50,x;
  public static void add()
  {
	  int a=10,b=20;
	  int c=a+b;
	  System.out.println(c);
	  
  }
  
	public static void main(String[] args)
	{
		methods m=new methods();
		m.add();
		
		methods.add();
		add();
		System.out.println("static variable"+p);	
		System.out.println(m.p);
		System.out.println(methods.p);
		
		System.out.println(m.q);
		
System.out.println(m.x);
	}

}
