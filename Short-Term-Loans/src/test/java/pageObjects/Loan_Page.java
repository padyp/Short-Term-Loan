package pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loan_Page {

	WebDriver driver;

	@CacheLookup
	@FindBy(id = "consent_prompt_submit")
	WebElement cookie;

	@CacheLookup
	@FindBy(id = "amount")
	WebElement amount;

	@CacheLookup
	@FindBy(xpath = "//button[@value='5']")
	WebElement day;

	@CacheLookup
	@FindBy(xpath = "//input[@id='radio-option-40']/following-sibling::label[@for='radio-option-40']")
	WebElement month;

	@CacheLookup
	@FindBy(xpath = "//input[@id='radio-option-47']/following-sibling::label[@for='radio-option-47']")
	WebElement month2;

	@CacheLookup
	@FindBy(className = "paragraph-notice-text-H76FoEzspf")
	WebElement firstPaymentText;


	public Loan_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void cookies() {
		cookie.click();
	}

	public void getStartAmount(String Amount) {
		amount.clear();
		amount.sendKeys(Amount);

	}

	public void daySelector() {
		day.click();
	}

	public void monthSelector_MinAmount() {
		month.click();
	}



	public void firstRepaymentText() {
		String expectedText = "If the date you select falls on a weekend or bank holiday, we’ll take it on the last working day before it’s due.";
		String actualText = firstPaymentText.getText();
		assertTrue(actualText.equals(expectedText), "First Repayment Text validation is not correct");

	}

	public void refreshPage() {
		driver.navigate().refresh();
	}
	public void monthSelector_MaxAmount() {
		month2.click();

	}

}
