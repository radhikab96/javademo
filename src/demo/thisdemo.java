package demo;

public class thisdemo {

	int a = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   thisdemo d = new thisdemo();
     d.read();
		
	}

	public void read()
    {
	   int a = 6;
	   System.out.println(a);
 	   System.out.println(this.a);
    }
}
