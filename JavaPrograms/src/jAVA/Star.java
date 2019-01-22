package jAVA;

import java.util.Scanner;

public class Star {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		int s1=s.nextInt();
		int i=s1;
		for(i=s1;i>0;i--)
		{
			System.out.print("");
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
