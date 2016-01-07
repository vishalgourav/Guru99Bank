package PageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NewCustomer_Page {
	private static WebElement element = null;
	public static WebElement Click_New_Customer(WebDriver driver)
	{
		element= driver.findElement(By.linkText("New Customer"));
		return element;
		}
public static WebElement Enter_Customer_Name(WebDriver driver)
{
	element= driver.findElement(By.name("name"));
	return element;
	}

//public static Select Select_Gender(WebDriver driver)
//{   
//	element=driver.findElement(By.name("rad1"));
//	Select s=new Select(element);
//	return s;
//}

public static List<WebElement> Select_Gender(WebDriver driver)
{   
	List<WebElement> x =driver.findElements(By.name("rad1"));
	return x;
}
public static WebElement Enter_DOB(WebDriver driver)
{
	element=driver.findElement(By.name("dob"));
	return element;
}
public static WebElement Enter_Address(WebDriver driver)
{
	element=driver.findElement(By.name("addr"));
	return element;
}
public static WebElement Enter_City(WebDriver driver)
{
	element=driver.findElement(By.name("city"));
	return element;
}
public static WebElement Enter_State(WebDriver driver)
{
	element=driver.findElement(By.name("state"));
	return element;
}
public static WebElement Enter_Pin(WebDriver driver)
{
	element=driver.findElement(By.name("pinno"));
	return element;
}
public static WebElement Enter_Mobile_no(WebDriver driver)
{
	element=driver.findElement(By.name("telephoneno"));
	return element;
}
public static WebElement Enter_Email(WebDriver driver)
{
	element=driver.findElement(By.name("emailid"));
	return element;
}
public static WebElement Enter_Password(WebDriver driver)
{
	element=driver.findElement(By.name("password"));
	return element;
}
public static WebElement Click_Reset(WebDriver driver)
{  
	element=driver.findElement(By.name("res"));
	return element;
}
}