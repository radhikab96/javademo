import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat d1 = new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat d2 = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(d1.format(d));
		System.out.println(d2.format(d));

	}

}
