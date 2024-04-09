package demo;

public class Childclass extends parentclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass c = new Childclass();
		
		c.infotaiment();
		c.brake();
		c.engine();
		c.colour();
		
	}
	
	public void infotaiment() {    //method overriding example
		// TODO Auto-generated method stub
		
		System.out.println("infotaiment child");
	}
	
	public void engine() {
		// TODO Auto-generated method stub
		
		System.out.println("new engine");
	}
	
	
	public void colour() {
		// TODO Auto-generated method stub
		
		System.out.println(col);
	}
	 
}
