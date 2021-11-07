package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class BasicValidation extends Base{
  @Test
  public void titleValidation() {
	  String expectedTitle = "Auden | Responsible Lending";
	  String actualTitle = driver.getTitle();
	  
	  assertTrue(actualTitle.equals(expectedTitle), "TitleValidation Failed");
  }
  @Test
  public void urlValidation() {
	  String expectedUrl = "https://www.auden.com/short-term-loan";
	  String actualUrl = driver.getCurrentUrl();
	  
	  assertTrue(actualUrl.equals(expectedUrl), "URL Validation Failed");
  }
  
  
  
  
  
}
