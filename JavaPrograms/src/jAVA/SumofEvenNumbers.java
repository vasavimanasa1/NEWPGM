package jAVA;

import java.util.Scanner;

public class SumofEvenNumbers 
{

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range");
	int Even=s.nextInt();
		int sum=0;
		for(int i=2;i<=Even;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of given range is:"+sum);
	}
}
