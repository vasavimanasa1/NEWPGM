package javasessions;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{
		//******************************************
		//Given string is palindrome or not
	
		Scanner s=new Scanner(System.in);
	    String str=s.nextLine();
	    System.out.println( str.toUpperCase());
	    String rev = "";
	   // rev.toUpperCase()
	for(int j=str.length()-1;j>=0;j--)
	{
		rev= rev+str.charAt(j);
	}
			if(rev.equals(str))
				
			System.out.println("The given string is palindrome");
		
		else
		
			System.out.println("Not a palindrome");
		
	}
	

}
