package javasessions;

import java.util.HashSet;
import java.util.Set;

public class DuplicatevaluesinArray {

	public static void main(String[] args) {
	String str[]= {"manasa","Arjun","java","javaTpoint","manasakrishna","manasa"};
	
	Set<String> store=new HashSet<String>();
	for(String name:str)
	{
		if(store.add(name)==false)
		{
			System.out.println("Duplicate values are::"+name);
		}
	}
	

	}

}
