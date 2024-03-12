import demo.CentralTraffic;
import demo.ContinentalTraffic;

public class AustrailanTraffic implements CentralTraffic,ContinentalTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic	a = new AustrailanTraffic();
		a.red();
		a.green();
		a.yello();
		
		AustrailanTraffic b = new AustrailanTraffic();
		b.getdata();
		
		ContinentalTraffic c = new AustrailanTraffic();
		b.userdata();

	}
	
	public void getdata() {
		// TODO Auto-generated method stub
		System.out.println("data");
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("implement red");
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("implement green");
	}

	@Override
	public void yello() {
		// TODO Auto-generated method stub
		System.out.println("implement yello");
	}

	@Override
	public void userdata() {
		// TODO Auto-generated method stub
		System.out.println("userdata");
	}

}
