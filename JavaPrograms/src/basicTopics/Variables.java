package basicTopics;

public class Variables 
{
	int a=90,b=10,j;//non static variables
	String s="Arjun";//Nonstatic string variable
	
	static int c=60,d=10,k;//Static variable
	static String s1="manasa";//Static String variable
	
	public static int add()
	{
		k=c+d;
		return k;
		//System.out.println("Addition of static variables is::"+k);
		
	}
	public int substraction()//nonstatic method
	{
		int h=a-b;
		return h;
		
	}
	
	
	public static void main(String[] args)
	{
		int p,q,r;
		Variables sv=new Variables();//creating refernence variable for 
		System.out.println(sv.substraction());
        System.out.println(add());
        System.out.println(Variables.add());
        System.out.println(sv.add());
        System.out.println(sv.s);
        System.out.println(sv.s1);
	}

}
