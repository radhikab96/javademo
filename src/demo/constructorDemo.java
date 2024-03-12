package demo;

public class constructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		constructorDemo d = new constructorDemo();
		constructorDemo cd = new constructorDemo(10, 5); 
		
		
	}
       public constructorDemo()
       {
    	   System.out.println("constructor");
       }
       
       public constructorDemo(int a,int b)
       {
    	  System.out.println(10);
       }
       
       public void gatdata()
       {
    	   System.out.println("data");
       }
}
