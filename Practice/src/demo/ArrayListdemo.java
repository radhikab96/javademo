package demo;

import java.util.ArrayList;

public class ArrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("ram");
		a.add("seetha");
		a.add("seetha"); //takes duplicate 
		a.add(1,"kumari");
		System.out.println(a);
		//a.remove(0);
		//a.remove("seetha");
		//System.out.println(a);
		System.out.println(a.contains("ram"));
		System.out.println(a.indexOf("kumari"));
		System.out.println(a.get(2));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

	}

}
