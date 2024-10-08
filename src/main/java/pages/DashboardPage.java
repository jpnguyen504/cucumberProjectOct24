package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
//	Element List
	@FindBy(how = How.XPATH, using = "//div[@class='panel-title']/strong")
	WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[@title='List Accounts']")
	WebElement LIST_ACCOUNT_BUTTON_ELEMENT;
	
	public void validateDashboardHeader() {
		Assert.assertEquals("Dashboard Page not found", "Dashboard", DASHBOARD_HEADER_ELEMENT.getText());
	}
	
	public void validateDashboardPageTitleQaEnvironment() {
		Assert.assertEquals("Dashboard Page not found", "Codefios QA", driver.getTitle());
	}
	
	public void clickListAccounts() {
		LIST_ACCOUNT_BUTTON_ELEMENT.click();
	}
}
