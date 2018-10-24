package jAVA;

public class variables {

	static  int a=10;//Non static variable
	
	public static void main(String[] args) 
	{
	
		variables a1=new variables();
	
   System.out.println(a1.a);
   //System.out.println(variables.a);
  // a1.a++;
  // System.out.println(a1.a);
   a1.n();

	}
public void n()
{
	System.out.println("Outside static"+a);
}
}
