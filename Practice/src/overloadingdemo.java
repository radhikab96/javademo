
public class overloadingdemo {
	
	//argument count must be different or argument datatype must be different

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overloadingdemo d = new overloadingdemo();
		d.add(10);
		d.add(50,60);
		d.add(1.0);

	}
      
	public void add(int i)
	{
		System.out.println(i);
	}
	public void add(int i,int j)
	{
		System.out.println(j);
	}
	public void add(double k)
	{
		System.out.println(k);
	}
}
