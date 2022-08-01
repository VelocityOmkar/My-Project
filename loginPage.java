package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class loginPage extends testBase {
	
	
	@FindBy(xpath="//input[@id='userid']") private WebElement userIdTextBox;
	@FindBy(xpath="//input[@id='password']") private WebElement passTextBox;
	@FindBy(xpath="//button[@type='submit']") private WebElement logInbtn;
	@FindBy(xpath="//a[@class='logo kite-logo']") private WebElement logo;
	@FindBy(xpath="//h2[text()='Login to Kite']") private WebElement label;
	@FindBy(xpath="//a[@class='text-light forgot-link']") private WebElement forgetLinkText;
	@FindBy(xpath="//input[@label='PIN']") private WebElement pinTextBox;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueBtn;

	public loginPage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		}
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public String validateLabel()
	{
		return label.getText();
	}
	
	public boolean validateLogo()
	{
		return logo.isDisplayed();
	}
	
	public String validateForgetLink() 
	{
		return forgetLinkText.getText();
	}
	
	public void loginZerodha() throws InterruptedException
	{
		userIdTextBox.sendKeys(prop.getProperty("username"));
		passTextBox.sendKeys(prop.getProperty("password"));
		logInbtn.click();
		Thread.sleep(1000);
		pinTextBox.sendKeys(prop.getProperty("pin"));
		continueBtn.click();
		Thread.sleep(3000);
		
		
	
	
	
	
	}
}
