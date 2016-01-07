package TestSuites;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import PageObjects.NewCustomer_Page;


public class NewCustomer {
	WebDriver driver=Guru99_Login_invalid.getDriver();
	@Test(priority=0)
	  public void click_custoemr_name() {
		  NewCustomer_Page.Click_New_Customer(driver).click();
	  }
  @Test(priority=1)
  public void enter_customer_name() {
	  NewCustomer_Page.Enter_Customer_Name(driver).sendKeys("Customer1");
  }
//  @Test(priority=2)
//  public void select_gender() {
//	  	  NewCustomer_Page.Select_Gender(driver).selectByValue("m");
//  }
@Test(priority=2)
public void select_gender() {
	  	  NewCustomer_Page.Select_Gender(driver).get(1).click();
}
@Test(priority=3)
public void enter_dob() {
	  	  NewCustomer_Page.Enter_DOB(driver).sendKeys("05/01/90");
}
@Test(priority=4)
public void enter_address() {
	  	  NewCustomer_Page.Enter_Address(driver).sendKeys("This is test address1");
}
@Test(priority=5)
public void enter_city() {
	  	  NewCustomer_Page.Enter_City(driver).sendKeys("test city");
}
@Test(priority=5)
public void enter_state() {
	  NewCustomer_Page.Enter_State(driver).sendKeys("teststate");
}
@Test(priority=6)
public void enter_pin() {
	  	  NewCustomer_Page.Enter_Pin(driver).sendKeys("11111");
}
@Test(priority=7)
public void enter_mobile_no() {
	  	  NewCustomer_Page.Enter_Mobile_no(driver).sendKeys("125466");
}
@Test(priority=8)
public void enter_email() {
	  	  NewCustomer_Page.Enter_Email(driver).sendKeys("abcd@abc.com");
}
@Test(priority=9)
public void enter_password() {
	  	  NewCustomer_Page.Enter_Password(driver).sendKeys("password");
	  	  }
@Test(priority=10)
public void click_submit() {
	  	  NewCustomer_Page.Click_Reset(driver).click();
}
}
