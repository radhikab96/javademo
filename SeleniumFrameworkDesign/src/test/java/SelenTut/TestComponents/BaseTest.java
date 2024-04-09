package SelenTut.TestComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.LandingPage;

public class BaseTest {
	
	public WebDriver driver;
	public LandingPage landingPage;
	
	public WebDriver initializeDriver() throws IOException 
	{
	
		//properties class
    Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
					+ "//src//main//java//rahulshettyacademy//resources//GlobalData.properties");
	prop.load(fis);
	String browserName = prop.getProperty("browser");
			
			
	if (browserName.equalsIgnoreCase("chrome"))
	{		
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	}
	else if (browserName.equalsIgnoreCase("firefox")) 
	{
		//System.setProperty("webdriver.gecko.driver",
			//	"/Users/rahulshetty//documents//geckodriver");
	//	driver = new FirefoxDriver();
		// Firefox
	} 
	else if (browserName.equalsIgnoreCase("edge")) {
		// Edge
		System.setProperty("webdriver.edge.driver", "edge.exe");
		driver = new EdgeDriver();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    return driver;
	}
	
	@BeforeMethod(alwaysRun=true)
	public LandingPage launchApplication() throws IOException
	{
		
		 driver = initializeDriver();
		 landingPage = new LandingPage(driver);
		landingPage.goTo();
		return landingPage;
	
		
	}
	
    @AfterMethod(alwaysRun=true)
	public void tearDown()
	{
		driver.close();
	}

}
