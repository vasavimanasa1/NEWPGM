package jAVA;

public class SwapString {

	public static void main(String[] args) 
	{
		String s1="manasa";
		String s2="Krishna";
		//s1=s1+s2;
		s1=s1.concat(s2);
		System.out.println("After concatinating   "+s1);
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After swaping s1 is::  " +s1+  "  s2 is::"+s2);
	}

}
