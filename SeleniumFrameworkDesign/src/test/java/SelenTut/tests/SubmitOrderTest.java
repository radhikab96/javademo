package SelenTut.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import SelenTut.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.OrderPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class SubmitOrderTest extends BaseTest {
	String productName = "ADIDAS ORIGINAL";	
	
    @Test
	public void submitOrder() throws IOException, InterruptedException
    {
		// TODO Auto-generated method stub
		        
	       ProductCatalogue productCatalogue = landingPage.loginApplication("radhi@exam.com", "Babureddy1234");	       
	       List<WebElement>products = productCatalogue.getProductList();
	       productCatalogue.addProductToCart(productName);
	       CartPage cartPage=  productCatalogue.goToCartPage();
	       
	       Boolean match = cartPage.VerifyProductDisplay(productName);
	       Assert.assertTrue(match);
	       CheckoutPage checkoutPage = cartPage.goToCheckout();
	       checkoutPage.selectCountry("india");
	       ConfirmationPage confirmationPage = checkoutPage.submitOrder();
	       String confirmMessage = confirmationPage.getConfirmationMessage();
		   Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	      
	       
	}
    //To verify ADIDAS ORIGINAL is displaying in orders page
    @Test(dependsOnMethods= {"submitOrder"})
	public void OrderHistoryTest()
	{
		//"ZARA COAT 3";
    	ProductCatalogue productCatalogue = landingPage.loginApplication("radhi@exam.com", "Babureddy1234");	
		OrderPage ordersPage = productCatalogue.goToOrdersPage();
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));
    	
	}	
    

}
