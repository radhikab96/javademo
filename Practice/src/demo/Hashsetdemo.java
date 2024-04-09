package demo;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("UK");
		hs.add("America");
		hs.add("India");
		hs.add("he");
		hs.add("she");
		
		hs.add("India"); //will not take as it is a duplicate
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//iterator
		 Iterator<String> i =  hs.iterator();
		 System.out.println(i.next());
		 System.out.println(i.next());
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		
		

	}

}
