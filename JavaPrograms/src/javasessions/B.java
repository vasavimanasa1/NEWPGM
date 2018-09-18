package javasessions;

public class B extends A 
{
	public B()
	{
		super(10);
		System.out.println("Child class constructor B");
	
	}

	public static void main(String[] args) throws Throwable {
		B obj =new B();
		A obj1 =new A();
		A obj2 = new A(10);
	
	}

}
