package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import pages.dashboardPage;
import pages.loginPage;

public class dashboardPageTest extends testBase {
	
	dashboardPage dash;
	loginPage login;

	public dashboardPageTest() throws IOException {
		super();
		}
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initial();
		login = new loginPage();
		dash = new dashboardPage();
		login.loginZerodha();
	}
	
	@Test(enabled = true, groups = "Sanity")
	public void validateNicknameTest() throws InterruptedException
	{
		String nick = dash.validateNickname();
		Assert.assertEquals(nick, "Omkar");
	}
	
	@Test(enabled = true, groups = "Sanity")
	public void validateProfileNameTest() throws InterruptedException
	{
		String profile = dash.validateProfileName();
		Assert.assertEquals(profile, "Omkar Sanjay Doke");
	}
	
	@Test(enabled = false)
	public void validateEmailIdTest() throws InterruptedException
	{
		String email = dash.validateEmailId();
		Assert.assertEquals(email,"omkardoke51@gmail.com");
	}
	
	@Test(enabled = true, groups = "Regression")
	public void buyShareTest() throws InterruptedException
	{
		dash.buyShare();
	}
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
