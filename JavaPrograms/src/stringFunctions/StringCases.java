package stringFunctions;

public class StringCases {

	public static void main(String[] args)
	{
		//***********Case1:String and String Buffer classes are final Present in java.lang package
		//Case2:
		/*****2 approaches to create String objects
				a.Without using new operator
				b.With using new operator
			1 Approach to create object to String Buffer class
				a.By using new operator**************/
		String s1="manasa";
		System.out.println(s1);
		String s2=new String("Krishna");
		System.out.println(s2);
		System.out.println("$$$$$$$$$$$");
		s1.concat("T");
		System.out.println(s1);
		
		String s3="manasa";
		System.out.println(s1.concat(s2));
		
		System.out.println("**********String Buffer*********");
		
		StringBuffer sb=new StringBuffer("manasa");//only one approach to create StringBuffer object
		System.out.println(sb);
		sb.append("T");
		System.out.println(sb);
		System.out.println(sb.reverse());
	
	}

}
