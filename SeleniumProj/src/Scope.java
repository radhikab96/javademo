import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radhib\\chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        //1.give me count of links on the page
        //2.count of footer section
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        //3.count of 1st column
        
        WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        
        //click on each link in the column & check if the pages are opening
        for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
        {
        	String clickonLinkTab = Keys.chord(Keys.SHIFT,Keys.ENTER);
        	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
        	Thread.sleep(5000);
        }
        
        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();
        while(it.hasNext())
          {
            	driver.switchTo().window(it.next());
            	System.out.println(driver.getTitle());
          }
     

	}

}
