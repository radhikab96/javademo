import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\radhib\\chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
      //  driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
       //driver.findElement(By.xpath("//a[@value='MAA']")).click(); //ElementNotInteractableException: element not interactable
       //to avoid index below line is used
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        
        //for selecting current date
       // driver.findElement(By.cssSelector(".ui-state-active")).click();  //for css selector using class any one can be selected but unique one
       // driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
       // driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        //	ui-state-default ui-state-highlight ui-state-active
        
        
      // driver.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight']")).click();
       driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
       
	}
	

}
