import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streamsdemo {

	//count the no. of names starting with A
		@Test
	public static void main (String[] args) {
				
    ArrayList<String> names = new ArrayList<String>();
    names.add("Abhijeet");  
    names.add("Don");
    names.add("Alekya");
    names.add("Adam");
    names.add("Ram");
    int count=0;
    for(int i=0;i<names.size();i++)
    {
    	String actual = names.get(i);
    	if(actual.startsWith("A"))
    	{
    		count++;
    	}
    		
    }
    
    System.out.println(count);
    streamFilter();
    streamMap();   
    streamCollect();
	}
		@Test
		public static void streamFilter() 
		{
			ArrayList<String> names = new ArrayList<String>();
		    names.add("Abhijeet");  
		    names.add("Don");
		    names.add("Alekya");
		    names.add("Adam");
		    names.add("Ram");
		    //there is no life for intermediate operation if there is no terminal op
		    //terminal operation execute only if inter op(filter) returns true
		    //we can create stream
		    //how to use filter in stream API
		    Long c = names.stream().filter(s->s.startsWith("A")).count();
		    System.out.println(c);
		    
		    long d = Stream.of("Abhijeet","Don","Alekya","Adam","Ram").filter(s->
		    {
		    	s.startsWith("A");
		    	return true;
		    }).count();
		    System.out.println(d);
		    
		    //print all names of arraylist
		   // names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		    names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		    
		    	}
		
		@Test
		public static void streamMap()
		{
			ArrayList<String> names = new ArrayList<String>();
		    names.add("man");  
		    names.add("Don");
		    names.add("women");
		   
		    
			//print names which have lat letter as A withuppercase
			Stream.of("Abhijeet","Don","Alekya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
			//print names which have first letter with uppercase and sorted
			List<String>names1 = Arrays.asList("Azhijeet","Don","Alekya","Adam","Rama");
			names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			//merging 2 different lists
			Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
			//newStream.sorted().forEach(s->System.out.println(s));
			boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
			System.out.println(flag);
			Assert.assertTrue(flag);
		}
		
		public static void streamCollect()
		{
			List<String> ls = Stream.of("Abhijeet","Don","Alekya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
			System.out.println(ls.get(0));
			
			List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
			//print unique no. from this array
			//sort the array 3rd index - 1,2,3,5,7,9
			//values.stream().distinct().forEach(s->System.out.println(s));
			
			List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		    System.out.println(li.get(2));
			
		}
		

}
