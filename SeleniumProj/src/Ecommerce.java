import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\radhib\\chromedriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        int j=0;
        String[] itemsneeded = {"Cucumber","Brocolli","Beetroot"};
      
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
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



















