import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class SelIntoduction {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		//Chrome
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\radhib\\chromedriver\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		//Microsoft edge
		System.setProperty("webdriver.edge.driver","C:\\Users\\radhib\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}
}