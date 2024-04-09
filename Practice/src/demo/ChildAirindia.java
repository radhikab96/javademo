package demo;

public class ChildAirindia extends ParentAircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildAirindia ct = 	new ChildAirindia();
		ct.colour();
		ct.engine();
		ct.safetyrules();
		
	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		
		System.out.println("red colour");
	}

}
