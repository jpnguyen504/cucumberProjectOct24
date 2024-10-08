package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;	//this driver from this class = the driver being put through the constructor
	}
	
//	Codefios Element List
	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	WebElement SIGN_IN_BUTTON_ELEMENT;
	
//	Sauce Element List
//	@FindBy(how = How.XPATH, using = "//input[@id='user-name']")
//	WebElement USERNAME_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//input[@id='password']")
//	WebElement PASSWORD_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//input[@id='login-button']")
//	WebElement SIGN_IN_BUTTON_ELEMENT;
	
	public void insertUsername(String username) {
		USERNAME_ELEMENT.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSignInButton() {
		SIGN_IN_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
