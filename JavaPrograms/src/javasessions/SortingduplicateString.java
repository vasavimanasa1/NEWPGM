package javasessions;

import java.util.HashSet;
import java.util.Set;

public class SortingduplicateString {
private static String Dstring(String s)
{
		String dupli="";
		String nor="";
		Set set =new HashSet<>();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(set.add(ch[i])==false)
				dupli=dupli+ch[i];
			else
				nor=nor+ch[i];
		}
			System.out.println(dupli);
			System.out.println(nor);
			return s;

	}
public static void main(String[] args) {
	Dstring("abccbbcdbbcada ");
}
}