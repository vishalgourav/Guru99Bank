package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout_Page {
	public static WebElement element =null;
	public static WebElement Click_Logout(WebDriver driver)
	{   element=driver.findElement(By.linkText("Log out"));
		return element;
	}

}
