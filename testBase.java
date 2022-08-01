package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public testBase() throws IOException
	{
	    prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Project01\\src\\main\\java\\Config\\Config.properties");
		prop.load(ip);
	}
	
	public static void initial(){
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Project01\\chromedriver97.exe");
		    driver = new ChromeDriver(options);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(prop.getProperty("url"));
		
		driver.get(prop.getProperty("url"));
		
	}

}
