package jAVA;

import java.util.Scanner;

public class Primenumber2 {

	public static void main(String[] args)
	{
		String primenumbers="";
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		for(int i=1;i<=p;i++)
		{
			int count=0;
			for(int num=i;num>=1;num--)
			{
				if(i%num==0)
					count=count+1;
			}
			if(count==2)
				primenumbers=primenumbers+i+" ";
		}
		System.out.println(primenumbers);
	}

}
