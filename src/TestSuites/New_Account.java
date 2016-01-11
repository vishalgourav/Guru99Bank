package TestSuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.New_Account_page;

public class New_Account {
	WebDriver driver=Guru99_Login_invalid.getDriver();
  @Test(priority=0)
  public void click_new_account() {
	  New_Account_page.Click_New_Account(driver).click();
  }
  @Test(priority=1)
  public void enter_customer_id() {
	  New_Account_page.Enter_Customer_ID(driver).sendKeys("66472");
	    }
  
  @Test(priority=2)
  public void select_account_type() {
	  New_Account_page.Select_Account_Type(driver).selectByIndex(1);
	    }
  @Test(priority=3)
  public void enter_initial_deposit() {
	  New_Account_page.Enter_Initial_Deposit(driver).sendKeys("1000");
	    }
  
  @Test(priority=4)
  public void enter_submit() {
	  New_Account_page.Enter_Submit(driver).click();
	    }
}
