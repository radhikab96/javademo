import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radhib\\chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(5));
       
        String[] itemsneeded = {"Cucumber","Brocolli","Beetroot"};
      
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
        addItems(driver,itemsneeded);
        driver.findElement(By.cssSelector("a.cart-icon")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        //explicit wait
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
        
        public static void addItems(WebDriver driver,String[] itemsneeded) 
        {
        	 int j=0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<products.size();i++)
        {
        	String[] name = products.get(i).getText().split("-");
        	String formattedname = name[0].trim();
        //	System.out.println(formattedname);
        	List itemsneededList = Arrays.asList(itemsneeded);
        	if(itemsneededList.contains(formattedname))
        	{
        		j++;
        		//click on Add to cart
        		//driver.findElements(By.cssSelector("div.product-action")).get(i).click();
        		  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
        		if (j==itemsneeded.length)
        		{
        		break;
        		}
        		
        	}
        	
        }
        
        
        }
       
}


