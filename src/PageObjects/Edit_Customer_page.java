package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Edit_Customer_page {
private static WebElement element=null;

public static WebElement Click_Edit_Customer(WebDriver driver)
{
	element=driver.findElement(By.linkText("Edit Customer"));
	return element;
}

public static WebElement Enter_Customer_ID(WebDriver driver)
{
	element =driver.findElement(By.name("cusid"));
	return element;
}
public static WebElement Click_Submit(WebDriver driver)
{
	element =driver.findElement(By.name("AccSubmit"));
	return element;
}
}
