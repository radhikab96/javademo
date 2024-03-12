package demo;

public class Superchilddemo extends SuperParentdemo {

	String name = "rahul";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superchilddemo d = new Superchilddemo();
		d.getdata();
		
	}

	//super keyword for variable, method
	public void getdata()
    {
	  super.getdata();
	   System.out.println(name);
 	   System.out.println(super.name);
    }
	//super keyword for constructor
	
	public Superchilddemo()
    {
	   super();  //doubt
	   System.out.println("child constructor");
    }
	
}

