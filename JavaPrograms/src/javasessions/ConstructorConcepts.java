package javasessions;

public class ConstructorConcepts {
	public ConstructorConcepts()
	{
		System.out.println("Default constructor");
	}

	public ConstructorConcepts(int i)
	{
		System.out.println("Single param constructor"+i);
	}
	public ConstructorConcepts(int i,int j)
	{
		System.out.println("two param constructor"+i+j);
	}


	public static void main(String[] args) {
	
		ConstructorConcepts obj=new ConstructorConcepts();
		ConstructorConcepts obj1=new ConstructorConcepts(10);
		ConstructorConcepts obj2=new ConstructorConcepts(10,20);
	}

}
