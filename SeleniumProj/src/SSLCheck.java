import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		//ssl certification,proxy server,blocking popups,change default directory
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipadress:4444");
		options.setCapability("proxy",proxy);
		options.setAcceptInsecureCerts(true);
		
		Map<String, Object> prefs = new HashMap<String, Object>();
      	prefs.put("download.default_directory", "/directory/path");
    	options.setExperimentalOption("prefs", prefs);
		
		//EdgeOptions options1 = new EdgeOptions();
		//options1.setAcceptInsecureCerts(true);		
		//WebDriver driver1 = new EdgeDriver(options1);
		//driver1.get("https://expired.badssl.com/");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
