package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class New_Account_page {
	public static WebElement element=null;
	public static WebElement Click_New_Account(WebDriver driver)
	
	{
		element=driver.findElement(By.linkText("New Account"));
		return element;
	}
	
public static WebElement Enter_Customer_ID(WebDriver driver)
	
	{
		element=driver.findElement(By.name("cusid"));
		return element;
	}

public static Select Select_Account_Type(WebDriver driver)

{
	element=driver.findElement(By.name("selaccount"));
	Select s=new Select(element);
	return s;
}

public static WebElement Enter_Initial_Deposit(WebDriver driver)

{
	element=driver.findElement(By.name("inideposit"));
	return element;
}

public static WebElement Enter_Submit(WebDriver driver)

{
	element=driver.findElement(By.name("button2"));
	return element;
}

}
