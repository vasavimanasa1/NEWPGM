package jAVA;

import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range ");
		int n=s.nextInt();
		int a=0,b=1,c;
		System.out.println("Fibonacci series in given range is::");
		System.out.print(a+" "+b+" ");
		for(int j=1;j<=n;j++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
			
		}
	}

}
