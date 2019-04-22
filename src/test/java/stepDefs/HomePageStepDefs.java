package stepDefs;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePageStepDefs {

	private WebDriver driver = Driver.getDriver();
	HomePage hp = new HomePage();
	WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
	
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		driver.get(ConfigurationReader.getProperty("url"));
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("the user click credit crads link")
	public void the_user_click_credit_crads_link() {
	    hp.creditCardsLink.click();
	}

	@Given("the user click Cash Rewards Credit Cards link")
	public void the_user_click_Cash_Rewards_Credit_Cards_link() {
		wait.until(ExpectedConditions.elementToBeClickable(hp.cashRewardsCardsLink));
	    hp.cashRewardsCardsLink.click();
	}

	@Given("the user click apply button for Cash Rewards Credit Cards")
	public void the_user_click_apply_button_for_Cash_Rewards_Credit_Cards() {
		wait.until(ExpectedConditions.elementToBeClickable(hp.applyNowButton));
	    hp.applyNowButton.click();
	}

	@When("the user verifies url and title")
	public void the_user_verifies_url_and_title() {
	    assertTrue(driver.getTitle().equalsIgnoreCase("Your Application"));
	    assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://secure.bankofamerica.com/applynow/welcome.go"));
	}

	@When("the user enters the first name")
	public void the_user_enters_the_first_name() {
		wait.until(ExpectedConditions.elementToBeClickable(hp.firstName));
		hp.firstName.sendKeys("Bob");
	}

	@When("the user enters the last name")
	public void the_user_enters_the_last_name() {
	//	wait.until(ExpectedConditions.elementToBeClickable(hp.lastName));
		hp.lastName.sendKeys("Smith");
	}

	@When("the user enters the address")
	public void the_user_enters_the_address() {
	    hp.address.sendKeys("18110 Larch Way");
	}

	@When("the user enters the city")
	public void the_user_enters_the_city() {
	    hp.city.sendKeys("Lynnwood");
	}

	@When("the user selecets the state")
	public void the_user_selecets_the_state() {
		WebElement dd =driver.findElement(By.id("zz_resi_dd_icai_state_v_1"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Washington");
	}

	@When("the user enters the zip code")
	public void the_user_enters_the_zip_code() {
	    hp.zip.sendKeys("98037");
	}

	@When("the user enters the phone number")
	public void the_user_enters_the_phone_number() {
		hp.phoneNumber.sendKeys("4256454567");
	}

	@When("the user selects the phone number type")
	public void the_user_selects_the_phone_number_type() {
		WebElement dd =driver.findElement(By.id("zz_phn_lb_ppnotp_v_1"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Mobile");	
	}
	
	@When("the user enters the email address")
	public void the_user_enters_the_email_address() {
		hp.email.sendKeys("ngrvr@icloud.com");
	}

	@When("the user answers the citizenship question")
	public void the_user_answers_the_citizenship_question() {
	    hp.citizenYes.click();
	}
	
	@When("the user enters the SSN")
	public void the_user_enters_the_SSN() {
	    wait.until(ExpectedConditions.invisibilityOf(hp.ssNumber));
	    hp.ssNumber.sendKeys("614976587");
	}
	

	@When("the user answers the dual citizenship question")
	public void the_user_answers_the_dual_citizenship_question() {
	    hp.dualCitizenshipNo.click();
	}

	@When("the user selects the country of residence")
	public void the_user_selects_the_country_of_residence() {
		WebElement dd =driver.findElement(By.id("zz_ci_citizenship_lb_country_of_residence_v_1"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("United States");
	}

	@When("the user enters the date of birth")
	public void the_user_enters_the_date_of_birth() {
	    hp.dob.sendKeys("11/11/1984");
	}

	@When("the user selects employment status")
	public void the_user_selects_employment_status() {
		WebElement dd =driver.findElement(By.id("zz_emp_empStatus_v_1"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Employed");
	}
	
	@When("the user selects occupation")
	public void the_user_selects_occupation() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement dd =driver.findElement(By.id("zz_emp_occupation_v_1-trunc"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Engineer");
	}

	@When("the user enters the total annual income")
	public void the_user_enters_the_total_annual_income() {
		hp.totalAnnualIncome.sendKeys("54000");
	}

	@When("the user selects the source of income")
	public void the_user_selects_the_source_of_income() {
		WebElement dd =driver.findElement(By.id("zz_name_tb_icai_psoi_v_1"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Employment");
		
	}

	@When("the user enters the montlhy housing payment")
	public void the_user_enters_the_montlhy_housing_payment() {
	    	hp.monthlyHousing.sendKeys("1980");
	}

	@When("the user click checkbox of agrement terms and conditions")
	public void the_user_click_checkbox_of_agrement_terms_and_conditions() {
	    hp.checkBoxAggreement.click();
	}
	
	@When("the user click Continue Button")
	public void the_user_click_Continue_Button() {
	    hp.continueButton.click();
	}
	
	

	
}