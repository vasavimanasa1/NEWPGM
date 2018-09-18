package javasessions;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		String p=s.nextLine();
		
		String rev="";
		for(int i=p.length()-1;i>=0;i--)
		{
			rev=rev+p.charAt(i);
		}
		System.out.println("Reversed string is::"+rev);
if(rev.equals(p))
{
	System.out.println("the given string is palindrome");
}
else
{
	System.out.println("Not a palindrome");
}
	}
	

}
