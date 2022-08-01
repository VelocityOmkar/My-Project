package Utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilities {
	
	

	public static void captureScreenshot(WebDriver driver,String name) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Project01\\Screenshot\\"+name+".png");
		FileHandler.copy(source, dest);
	
	}
}
