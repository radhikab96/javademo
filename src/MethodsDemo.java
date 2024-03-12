
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		Integer name = d.getdata();
		System.out.println(name);
		
		MethodsDemo2 d2 = new MethodsDemo2();
        String val = d2.getuserdata();
		System.out.println(val);
		
		getdata2();
		
	}

	public Integer getdata()
	{
		System.out.println("hii");
		return 20;
	}
	
	public static Integer getdata2()
	{
		System.out.println("hello");
		return 20;
	}
}
