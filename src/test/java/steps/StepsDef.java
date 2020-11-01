package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BankCash;
import page.LoginPage;
import util.BrowserFactory;

public class StepsDef {

	WebDriver driver;
	LoginPage login;
	BankCash bankCashPage;

	@Before
	public void BeforeRun() {
		driver = BrowserFactory.startBrowser();
		login = PageFactory.initElements(driver, LoginPage.class);
		bankCashPage = PageFactory.initElements(driver, BankCash.class);
	}

	@Given("^User is on  Techfios  the login  page$")
	public void user_is_on_Techfios_the_login_page() throws Throwable {
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_and(String username, String password) throws Throwable {
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
	}

	@When("^User enters the username as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_the_username_as_and(String username, String password) throws Throwable {
		login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName(username);
		login.enterPassword(password);
	}

	@When("^User clicks on login buttons$")
	public void user_clicks_on_login_buttons() throws Throwable {
		login.clickSignInButton();
		Thread.sleep(4000);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		// driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		login.clickSignInButton();
		Thread.sleep(4000);
	}

	@Then("^User should be able to see the dashboard$")
	public void user_should_be_able_to_see_the_dashboard() throws Throwable {
		login.takeScreenShotAtEndOfTest(driver);

	}

	@Then("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() throws Throwable {
		bankCashPage = PageFactory.initElements(driver, BankCash.class);
		bankCashPage.clickOnBankCashPage();
		Thread.sleep(2000);
	}

	@Then("^User clicks on new account$")
	public void user_clicks_on_new_account() throws Throwable {
		bankCashPage = PageFactory.initElements(driver, BankCash.class);
		bankCashPage.clickOnNewAccount();
		Thread.sleep(2000);

	}

	@Then("^User fill up the form entering \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and clicks on submit button$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit_button(String accountTitle,
			String description, String initialBalance, String accountNumber, String contactperson, String phone,
			String internetBankingurl) throws Throwable {
		bankCashPage = PageFactory.initElements(driver, BankCash.class);
		bankCashPage.newAccountDetails(accountTitle, description, initialBalance, accountNumber, contactperson, phone,
				internetBankingurl);
		Thread.sleep(2000);
	}

	@Then("^User should be able to see validate$")
	public void user_should_be_able_to_see_validate() throws Throwable {
		String expectedValidate = "NewAccount";
		String actualValidate = "NewAccount";
		Assert.assertEquals(expectedValidate, actualValidate);
		login.takeScreenShotAtEndOfTest(driver);

		System.out.println("USER SUCCESSFULLY OENENED THE ACCOUNT");
		Thread.sleep(2000);
	}

	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}
}
