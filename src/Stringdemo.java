
public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //String is an object.String literal
		String s3 = "Seeta";
		String s1 = "Seeta";  // point to s mem location
		
   //new
		String s2 = new String("welcome");
		
		String s = "Rahul Shetty Academy";
		
		//String[] name  = s.split("Shetty");		)
		String[]   name = s.split("Shetty");
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[1].trim());
		
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i));
	}
	
	//Reverse String
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.println(s.charAt(i));
	}
	
	String d = "welcome"+" home"; //also concat()method
	 System.out.println(d);

}
}
