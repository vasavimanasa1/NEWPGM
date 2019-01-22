package jAVA;

public class RemoveJunkString {

	public static void main(String[] args) 
	{
		String s1="@#$%^Manasa9553078672";
	String s2=s1.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(s2);

	}

}
