package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListAccountsPage {

	WebDriver driver;
	
	public ListAccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element List
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement ADD_ACCOUNT_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_name']")
	WebElement ACCOUNT_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//textarea")
	WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='accountSave']")
	WebElement SAVE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//tr[1]/td[2]")
	WebElement FIRST_ROW_ACCOUNT_ELEMENT;
	
	
	public void clickAddAccountButton() {
		ADD_ACCOUNT_BUTTON_ELEMENT.click();
	}
	
	public void insertAccountName(String accountName) {
		ACCOUNT_NAME_ELEMENT.sendKeys(accountName);
	}
	
	public void insertDescription(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description);
	}
	
	public void insertInitialBalance(String initialBalance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(initialBalance);
	}
	
	public void insertAccountNumber(String accountNumber) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(accountNumber);
	}
	
	public void insertContactPerson(String contactPerson) {
		CONTACT_PERSON_ELEMENT.sendKeys(contactPerson);
	}
	
	public void clickSaveButton() {
		SAVE_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void validateAccountCreatedSuccessfully() {
		Assert.assertEquals("Account Not Created Successfully", "JP Test", FIRST_ROW_ACCOUNT_ELEMENT.getText());
	}
}
