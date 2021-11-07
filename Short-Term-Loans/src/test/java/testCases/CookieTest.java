package testCases;

import org.testng.annotations.Test;

import pageObjects.Loan_Page;

public class CookieTest extends Base{
  @Test
  public void acceptCookie() {
	  Loan_Page accept = new Loan_Page(driver);
	  accept.cookies();
  }
}
