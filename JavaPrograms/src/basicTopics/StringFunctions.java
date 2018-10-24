package basicTopics;

public class StringFunctions {

	public static void main(String[] args) 
	{
		String s1="It started raining here too";
		String s2="we love Arjun always";
		String s3="  Manasa Krishna  ";
		String s4="Manasa_Krishna_Arjun_Kunchala";
		
		//How to find length of string
		System.out.println("Length of s1 is::"+s1.length());
		System.out.println("Length of s2 is::"+s2.length());
		//How to find index of particulr character
		System.out.println(s1.charAt(5));
		System.out.println(s2.charAt(8));
		//How to find index of particular character
		
		System.out.println(s1.indexOf('t'));
		//How to find second character(Like one)of same char
		
		
	   System.out.println(s1.indexOf('t',s1.indexOf('t')+1));
	   
	   
	   //How to find index of substring
	   System.out.println(s1.indexOf("here"));
	   System.out.println(s2.indexOf("Arjun"));
	   //Compare two strings
	   System.out.println(s1.equals(s2));
	   //To print substring from main string
	   System.out.println(s1.substring(2, 6));
	   //How to trim
	   System.out.println(s3);
	   System.out.println(s3.trim());//Trims before and after spaces
	   //how to trim between spaces
	   System.out.println(s3.replace(" ", ""));
	   //How to split the string
	  
	   
	   System.out.println("Before splitting the string is:: "+s4);
	  
	   String s5[]=s3.split("_");
	   for(int i=0;i<s5.length;i++)
	   {
		   System.out.println(s5[i]);
	   }
	   
	   int a=10;
	   String p=String.valueOf(a);
	   System.out.println(p);
	   //String Buffer
	   StringBuffer sb=new StringBuffer("Selenium");
	   sb.reverse();
	   System.out.println(sb);
	   sb.capacity();
	   System.out.println(sb.capacity());
	  

	}

}
