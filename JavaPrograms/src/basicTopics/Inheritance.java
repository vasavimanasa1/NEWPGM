package basicTopics;

public class Inheritance
{

	public static void main(String[] args) 
	{
		InheritanceConcepts pc=new InheritanceConcepts();
		pc.add(1, 3);
		pc.mul();
		ChildClass cc=new ChildClass();
		cc.add(3, 4,5);
		cc.mul();
		InheritanceConcepts ip=new ChildClass();
		ip.mul();
    System.out.println(pc.s);
    
	}

}
