package stringFunctions;

public class Case4Emp {
	int empid;
	String ename;
	Case4Emp(int empid,String ename)
	{
		this.empid=empid;
		this.ename=ename;
	}

	public String toString()
	{
		return "  emp id::"+empid+  "   emp name::" +  ename;
	}
	public static void main(String[] args) 
	{
		Case4Emp e=new Case4Emp(1,"m");
		System.out.println(e);//stringFunctions.Case4Emp@7852e922
		System.out.println(e.toString());//stringFunctions.Case4Emp@7852e922

	}

}
