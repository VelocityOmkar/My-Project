package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import pages.loginPage;

public class loginPageTest extends testBase {
	
	loginPage login;

	public loginPageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initial();
		login = new loginPage();
		
	}
	
	@Test
	public void validateLoginPageTitleTest()
	{
		String title = login.validateLoginPageTitle();
		System.out.println("title of page "+title);
		Assert.assertEquals(title, "Kite - Zerodha's fast and elegant flagship trading platform");
	}
	
	@Test
	public void validateLabelTest()
	{
		String label = login.validateLabel();
		Assert.assertEquals(label, "Login to Kite");
	}
	
	@Test
	public void validateLogoTest()
	{
		boolean value = login.validateLogo();
	    Assert.assertEquals(value, true);
		
	}
	
	
	@Test
	public void loginZerodhaTest() throws InterruptedException
	{
		login.loginZerodha();
	}
	
	
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
