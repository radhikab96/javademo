package SelenTut.tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import SelenTut.TestComponents.BaseTest;
import rahulshettyacademy.pageobjects.CartPage;
import rahulshettyacademy.pageobjects.CheckoutPage;
import rahulshettyacademy.pageobjects.ConfirmationPage;
import rahulshettyacademy.pageobjects.ProductCatalogue;

public class ErrorValidationsTest extends BaseTest {
	
    @Test(groups= {"ErrorHandling"})
	public void LoginErrorValidation() throws IOException, InterruptedException
    {
		// TODO Auto-generated method stub
		  String productName = "ADIDAS ORIGINAL";	      
	      landingPage.loginApplication("radhi@exam.com", "Babureddy34");	       	  
	     // .ng-tns-c4-10.ng-star-inserted.ng-trigger.ng-trigger-flyInOut.ngx-toastr.toast-error
	       Assert.assertEquals("Incorrect email or password.",landingPage.getErrorMessage());     
	       
	}
    
    @Test
   	public void ProductErrorValidation() throws IOException, InterruptedException
       {
   		// TODO Auto-generated method stub
   		  String productName = "ADIDAS ORIGINAL";	      
   	       ProductCatalogue productCatalogue = landingPage.loginApplication("Somesh@exam.com", "Babureddy1234");	       
   	       List<WebElement>products = productCatalogue.getProductList();
   	       productCatalogue.addProductToCart(productName);
   	       CartPage cartPage=  productCatalogue.goToCartPage();
   	       
   	       Boolean match = cartPage.VerifyProductDisplay("ADIDAS ORIGINALLL");
   	       Assert.assertFalse(match);
   	       
   	      
   	       
   	}


}
