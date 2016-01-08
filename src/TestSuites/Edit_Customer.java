package TestSuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.Edit_Customer_page;

public class Edit_Customer {
	WebDriver driver=Guru99_Login_invalid.getDriver();
  @Test(priority=0)
  public void click_edit_customer()
    {
	 Edit_Customer_page.Click_Edit_Customer(driver).click();
  }
		  @Test(priority=1)
	  public void enter_customer_id()
	    {
		 Edit_Customer_page.Enter_Customer_ID(driver).sendKeys("66472");
	  }
		  @Test(priority=2)
		  public void click_submit()
		    {
			 Edit_Customer_page.Click_Submit(driver).click();
		  }
}
