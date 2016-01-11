package TestSuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.Logout_Page;

public class Logout {
	WebDriver driver=Guru99_Login_invalid.getDriver();
	  @Test(priority=0)
	  public void click_edit_customer()
	    {
		 Logout_Page.Click_Logout(driver).click();
		 driver.switchTo().alert().accept();
	  }
}
