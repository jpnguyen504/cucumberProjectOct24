package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.ListAccountsPage;
import pages.LoginPage;
import pages.TestBase;

public class HomeworkStepDefinitions extends TestBase {
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	ListAccountsPage listAccountsPage;
	
	@Before
	public void setup() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		listAccountsPage = PageFactory.initElements(driver, ListAccountsPage.class);
	}
	
	@Given("User is on the codefios login page")
	public void user_is_on_the_codefios_login_page() {
		driver.get("https://qa.codefios.com/");
	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String loginData, String inputField) {
		switch(inputField) {
			case "username":
				loginPage.insertUsername(loginData);
				break;
			case "password":
				loginPage.insertPassword(loginData);
				break;
		}
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String button) {
		switch(button) {
			case "login":
				loginPage.clickSignInButton();
				break;
			case "listAccounts":
				dashboardPage.clickListAccounts();
				break;
			case "addAccount":
				listAccountsPage.clickAddAccountButton();
				break;
			case "Save":
				listAccountsPage.clickSaveButton();
				break;
		}
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		dashboardPage.validateDashboardHeader();
//		dashboardPage.validateDashboardPageTitleQaEnvironment();
		
	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String userData, String inputField) {
		switch(inputField) {
			case "accountName":
				listAccountsPage.insertAccountName(userData);
				break;
			case "description":
				listAccountsPage.insertDescription(userData);
				break;
			case "initialBalance":
				listAccountsPage.insertInitialBalance(userData);
				break;
			case "accountNumber":
				listAccountsPage.insertAccountNumber(userData);
				break;
			case "contactPerson":
				listAccountsPage.insertContactPerson(userData);
				break;
		}
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		listAccountsPage.validateAccountCreatedSuccessfully();
	}
	
//	@After	// commented out while I test
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
