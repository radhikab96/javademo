package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void prerequisite()
	{
		System.out.println("I will execute last");
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void Afsuite()
	{
		
		System.out.println("Iam the last");
	}	
	
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}
	
}

