import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fluentwait {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//driver.get("http:\\google.com");
		//File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);;
	   // FileUtils.copyFile(src, new File("C:\\Users\\radhib\\Downloads\\screenshot.png"));
		
		//file upload, download
		//driver.get("https://rahulshettyacademy.com/upload-download-test/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    //driver.findElement(By.id("fileinput")).sendKeys("C:\\Users\\radhib\\Downloads\\Selenium notes\\selenium locators.rtf");
	    //driver.findElement(By.id("downloadButton")).click();
		
		//array ia an object which contains elements of similar datatype
		int[] arr = {10,30,60};
		System.out.println(arr[1]);
		for(int i:arr)
		{
			System.out.println(i);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=arr.length-1;i>=0;i--) //reverse
		{
			System.out.println(arr[i]);
		}
		
		//2 4 5
		//6 8 9
		
		int[][] a = {{2,4,5},{6,8,9}};
		System.out.println(a[1][1]);
		
			
		//string is an object that represents sequence of characters
		String name = "seeta"; //string literal
		String name1 = new String("rahul shetty academy");
		
		String[] newname = name1.split("shetty");
		System.out.println(newname[0]);
		System.out.println(newname[1].trim());
		
		//for(int i=0;i<name1.length();i++)
		//{
		//	System.out.println(name1.charAt(i));
		//}
		
		
		for(int i=name1.length()-1;i>=0;i--)
		{
			System.out.println(name1.charAt(i));	
		}
		
		System.out.println(name.concat(" "+name1));
	
		
		

	}

}
