package jAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class sortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> AL=new ArrayList<String>();
		AL.add("m");
		AL.add("n");
		AL.add("a");
		Collections.sort(AL);
		Iterator itr=AL.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
