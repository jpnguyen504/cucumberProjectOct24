package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinitions extends TestBase {

//	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//	cannot define the object in the same line because we don't initialize the 
//	driver until the init() method is called. Doing this globally will bring the
//	driver into the LoginPage driver. Then when we start with the init() it switches
//	driver control back to the TestBase. So any loginPage.methods() used after that
//	will have the driver control in the TestBase so they won't work.
//	So we can initialize the object globally but cannot define in the same line with:
	LoginPage loginPage;
	DatabasePage databasePage;
	DashboardPage dashboardPage;

//	@Before
	public void setup() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		//having this line of code in the setup
		//will make it so test case can enter either the 
		//username or password first in the feature file
		//instead of defining the object in the enter username step
		//otherwise if its defined in the enter username step then making it so entering the
		//password first would cause a NullPointerException
		databasePage = new DatabasePage();
//		not using PageFactory because there isn't a driver to run
//		through into the Page class
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@Given("User is on the techfios billing login page")
	public void user_is_on_the_techfios_billing_login_page() {
//		driver.get("https://www.codefios.com/ebilling");
		driver.get("https://qa.codefios.com/");
//		driver.get("https://www.saucedemo.com");
	}

	@When("User enters {string} from mysql database")
	public void user_enters_from_mysql_database(String loginData) {
	    if(loginData.equalsIgnoreCase("username")) {
	    	loginPage.insertUsername(databasePage.getDataFromDb("username"));
	    	System.out.println("username from DB: " + databasePage.getDataFromDb("username"));
	    	
	    }else if(loginData.equalsIgnoreCase("password")) {
	    	loginPage.insertPassword(databasePage.getDataFromDb("password"));
	    	System.out.println("password from DB: " + databasePage.getDataFromDb("password"));
	    }else {
	    	System.out.println("Unable to retrieve " + loginData + " data from DB");
	    }
	}
	
	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage.insertUsername(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.insertPassword(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
//		Codefios Validation
		String expectedTitle = "Codefios QA";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Dashboard Page Not Found", expectedTitle, actualTitle);
		System.out.println(actualTitle);
		
//		SauceDemo validation
//		String expectedHeader = "Products";
//		String actualHeader = driver.findElement(By.xpath("//span[@class='title']")).getText();
//		Assert.assertEquals("Page Not Found", expectedHeader, actualHeader);
//		takeScreenshot(driver);
	}
	
	@When("User clicks on list accounts")
	public void user_clicks_on_list_accounts() {
	    dashboardPage.clickListAccounts();
	}

	
//	@After
	public void tearDown() {
		driver.close();	//close will only close that active window
		driver.quit();	//quit will close all window and and end the WebDriver session
	}
}
