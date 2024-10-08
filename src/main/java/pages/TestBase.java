package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {	//also called the BrowserFactory
	
	public static WebDriver driver;	//WebDriver is an interface
									//we initialize the reference variable of driver 
									//off of the WebDriver interface
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();	//ChromeDriver() is a class
										//driver is a new instance of the ChromeDriver() class
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void takeScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		//example of typecasting - both WebDriver and TakesScreenshot are interfaces
		//you can always cast from an interface to another interface
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshots/" + label + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
