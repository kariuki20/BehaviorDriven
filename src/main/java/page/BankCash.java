package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankCash {

	WebDriver driver;
	
	public BankCash(WebDriver driver) {
		this.driver = driver;
		
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a")
	WebElement BANKCASH_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NEW_ACOOUNT_FIELD;
	@FindBy(how=How.XPATH,using="//*[@id=\"account\"]")
	WebElement ACCOUNT_TITLE_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"balance\"]")
	WebElement DESCRIPTION_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"balance\"]")
	WebElement INITIAL_BALANCE_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"account_number\"]")
	WebElement ACCOUNT_NUMBER_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"contact_phone\"]")
	WebElement PHONE_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"ib_url\"]")
	WebElement INTERNET_BANKING_URL;
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[2]/form/button")
	WebElement SUBMIT_BUTTON_LOCATOR;
	
	// Methods to interact with the elements
	public void clickOnBankCashPage() {
		BANKCASH_FIELD.click();
		
	}
	public void clickOnNewAccount() {
		NEW_ACOOUNT_FIELD.click();	
		
	}
	
	public void newAccountDetails(String accountTitle, String description, String initialBalance, String accountNumber,
			String contactperson, String phone, String internetBankingurl) {
		
		ACCOUNT_TITLE_LOCATOR.sendKeys(accountTitle);
		DESCRIPTION_LOCATOR.sendKeys(description);
		INITIAL_BALANCE_LOCATOR.sendKeys(initialBalance);
		ACCOUNT_NUMBER_LOCATOR.sendKeys(accountNumber);
		CONTACT_PERSON_LOCATOR.sendKeys(contactperson);
		PHONE_LOCATOR.sendKeys(phone);
		INTERNET_BANKING_URL.sendKeys(internetBankingurl);
	}
	public void clicksubmit() {
		SUBMIT_BUTTON_LOCATOR.click();
	}
}