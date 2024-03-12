import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=10;
		String name = "radhika";
		char letter = 'k';
		double dec = 0.3;
		System.out.println(val);
		System.out.println(name);
		System.out.println(letter);
		
		//My Project
		
		//Arrays
		
		int[]arr = new int[3];
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 8;
		System.out.println(arr[0]);
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
		
		//Or
		
		//int[] arr = {12,13,14};
		
		//Array of strings
		
		 String[] name2 = {"rishi", "seetha", "ravi"};
		 
		 for(int i=0; i<name2.length; i++)
		 {
			 System.out.println(name2[i]);
		 }
	
		 //enhanced for loop
		 for(String s:name2)
		 {
			 System.out.println(s);
		 }
	
		 //ArrayList int type
		 
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(20);
		a.add(10);
		a.add(40);
		//a.remove(2);
		System.out.println(a.get(0));
		System.out.println(a);
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		//ArrayList String type
		ArrayList<String> b= new ArrayList<String>();
		b.add("kumar");
		b.add("vijay");
		b.add("maha");
		b.remove(2);
	
		System.out.println(b.get(0));
		//System.out.println(b);
		
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i));
		}
		
		
		//to check item present in ArrayList
		System.out.println(b.contains("vijay"));
		
		//covert array to arraylist
		
		Integer[] num = {10,30,50};
		
		List<Integer> mynum = Arrays.asList(num);
		System.out.println(mynum.contains(20));
		
		
		
	 
	}	 
	 
	 
	
}
