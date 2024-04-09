package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selenium
		System.out.println("WebloginhomePersonalloan");
		System.out.println(uname);
	}
	
	@Test(groups= {"smoke"})
	public void MobileloginHomeLoan()
	{
		//Appium
		System.out.println("Mobileloginhome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest Api automation
		System.out.println("APIloginhome");
	}
	
}
