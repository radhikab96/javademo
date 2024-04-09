import java.io.IOException;
		import java.net.HttpURLConnection;
		import java.net.MalformedURLException;
		import java.net.URL;
		import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.asserts.SoftAssert;
		
public class brokenlink2 {
		 
			public static void main(String[] args) throws MalformedURLException, IOException {
				// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
				//broken URL
		        //Step 1 - IS to get all urls tied up to the links using Selenium
		        //  Java methods will call URL's and gets you the status code
		        //if status code >400 then that url is not working-> link which tied to url is broken
				
				String url  = driver.findElement(By.cssSelector("a[href*='appiumselenium']")).getAttribute("href");
				
				//String url = link.getAttribute(driver.findElement(By.cssSelector("a[href*='appiumselenium']"));		
				HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		        conn.setRequestMethod("HEAD");
		        conn.connect();
		        int respCode = conn.getResponseCode();
		        System.out.println(respCode);
		      
			}

		}
