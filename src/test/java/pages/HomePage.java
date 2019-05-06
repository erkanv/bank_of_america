package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;

public class HomePage {
	private WebDriver driver;
	
	public HomePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "navCreditCards")
	public WebElement creditCardsLink;
	
	@FindBy(id = "cashRewardsCards")
	public WebElement cashRewardsCardsLink;
	
	@FindBy(id = "home_4032207~ER~en_US")
	public WebElement applyNowButton;
	
	@FindBy(id = "zz_name_tb_icai_fnm_v_1")
	public WebElement firstName;
	
	@FindBy(id = "zz_name_tb_icai_lnm_v_1")
	public WebElement lastName;
	
	@FindBy(id = "zz_resi_tb_icai_add1_v_1")
	public WebElement address ;
	
	@FindBy(id = "zz_resi_tb_icai_city_v_1")
	public WebElement city ;
	
	@FindBy(id = "zz_resi_tb_icai_zip_v_1")
	public WebElement zip;
	
	@FindBy(id = "zz_phone_tb_icai_ppn_v_1")
	public WebElement phoneNumber;
	
	@FindBy(id = "zz_email_tb_icai_v_1")
	public WebElement email ;
	
	@FindBy(id = "zz_bi_uscitizen_yes_v_1-real")
	public WebElement citizenYes;
	
	@FindBy(id = "zz_bi_dual_citizenship_no_v_1-real")
	public WebElement dualCitizenshipNo;
	
	@FindBy(id = "zz_name_tb_icai_tan_v_1")
	public WebElement totalAnnualIncome;
	
	@FindBy(id = "zz_name_tb_icai_mhp_v_1")
	public WebElement monthlyHousing;
	
	@FindBy(id = "zz_icai_resp_consent_v_1-real")
	public WebElement checkBoxAggreement;
	
	@FindBy(id = "zz_ssndob_tb_icai_dateOfBirth_v_1")
	public WebElement dob;
	
	@FindBy(linkText = "Continue")
	public WebElement continueButton;
	
	@FindBy(id="zz_ssndob_tb_icai_ssn_v_1")
	public WebElement ssNumber;

	@FindBy(linkText = "Submit")
	public WebElement submitButton;


	
	
	

	
}
