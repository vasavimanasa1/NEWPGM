package javasessions;

import java.util.Scanner;

public class PrintingStars {

	public static void main(String[] args)
	{
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of stars to be printed");
		int p=s.nextInt();
		for(i=1;i<=p;i++)
		{
			System.out.println(" ");
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
				
			}
			
		}
		System.out.println( );

	}

}
