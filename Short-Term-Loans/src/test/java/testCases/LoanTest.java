package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Loan_Page;

public class LoanTest extends Base{

	Loan_Page create;

	@Parameters({"minAmount"})
	@Test
	public void loanValidation_MinAount(String Lamount) {
		create = new Loan_Page(driver);
		create.getStartAmount(Lamount);
		create.daySelector();
		create.monthSelector_MinAmount();
		create.firstRepaymentText();
		create.refreshPage();
	}


//	@Parameters({"maxAmount"})
//	@Test
//	public void loanValidation_MaxAount(String Lamount) {
//		create = new Loan_Page(driver);
//		create.getStartAmount(Lamount);
//		create.daySelector();
//		create.monthSelector_MaxAmount();
//		create.firstRepaymentText();
//		create.refreshPage();
//	}
}
