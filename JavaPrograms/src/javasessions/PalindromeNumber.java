package javasessions;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to check");
		int i=s.nextInt();
		int sum=0,temp;
		int temp1=i;
		while(temp1>0)
		{
			temp=temp1%10;
			sum=(sum*10)+temp;
			temp1=temp1/10;
		}
		if(i==sum)
			System.out.println("palindrome");
		
		else
			System.out.println("not palidrome");
	}

}
