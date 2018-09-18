package javasessions;

import java.util.Scanner;

public class Reverse
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string to reverse");
		Scanner s=new Scanner(System.in);
		String p=s.nextLine();   
		System.out.println(p);
		System.out.println("The length of sring is"+p.length());
		String rev="";
		for(int i=p.length()-1;i>=0;i--)
		{
			rev=rev+p.charAt(i);
		}
		
		System.out.println("Reversed sring is::"+rev);
	}
		
	}
    

