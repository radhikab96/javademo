import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver = new ChromeDriver();
  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
  String name = "rahulshettyacademy";
  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
  driver.findElement(By.id("username")).sendKeys(name);
  driver.findElement(By.name("password")).sendKeys("learning");
  driver.findElement(By.xpath("//label[2]/span[2]")).click();
  //Thread.sleep(2000);
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
  driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
  WebElement Staticdropdown = driver.findElement(By.cssSelector("select.form-control"));
  
  Select dropdown = new Select(Staticdropdown);
  dropdown.selectByIndex(2);
  System.out.println(dropdown.getFirstSelectedOption().getText());
  driver.findElement(By.xpath("//input[@name='terms']")).click();
  driver.findElement(By.id("signInBtn")).click();
 
  
  
  
	}

}
