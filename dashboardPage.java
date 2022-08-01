package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class dashboardPage extends testBase{
	
	@FindBy(xpath="//span[@class='nickname']") private WebElement nicknameLabel;
	@FindBy(xpath="//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath="//h4[@class='username']") private WebElement usernameLabel;
	@FindBy(xpath="//div[@class='email']") private WebElement email;
	
	@FindBy(xpath="//input[@icon='search']") private WebElement searchBarTextbox;
	@FindBy(xpath="//span[@class='tradingsymbol']") private WebElement selectShare;
	@FindBy(xpath="//button[@class='button-blue']") private WebElement buyBtnSearchBar;
	@FindBy(xpath="//input[@label='Qty.']") private WebElement qtyTextbox;
	@FindBy(xpath="//input[@label='Price']") private WebElement priceTextbox;
	@FindBy(xpath="//button[@class='button-outline cancel']") private WebElement cancelBtn;
	@FindBy(xpath="//button[@class='submit']") private WebElement buyBtn;
	@FindBy(xpath="//label[@class='su-switch-control']") private WebElement toggleBtn;
	
	

	public dashboardPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		}
	
	public String validateNickname()
	{
		return nicknameLabel.getText();
	}
	
	public String validateProfileName() throws InterruptedException
	{
		userId.click();
		Thread.sleep(1000);
		return usernameLabel.getText();
	}
	
	public String validateEmailId() throws InterruptedException
	{
		userId.click();
		Thread.sleep(1000);
		return email.getText();
	}
	
	public void buyShare() throws InterruptedException
	{
		searchBarTextbox.sendKeys("TCS");
		Actions a = new Actions(driver);
		a.moveToElement(selectShare).build().perform();
		
		buyBtnSearchBar.click();
		Thread.sleep(1000);
		qtyTextbox.clear();
		qtyTextbox.sendKeys("10");
		Thread.sleep(1000);
		priceTextbox.clear();
		priceTextbox.sendKeys("3400");
		Thread.sleep(2000);
		toggleBtn.click();
		Thread.sleep(2000);
		cancelBtn.click();
		Thread.sleep(2000);
		
		
	}

		
	}
	

	
	


