package jAVA;

import java.util.Scanner;

public class Primenumber
{
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
		int r=s.nextInt();
		
		int i;
		for(i=2;i<r;i++)
		if(r%i==0)
			break;
			if(i==r)
			
				System.out.println("The given number is prime");

			
			else
				System.out.println("Not prime");
		
	}

}
