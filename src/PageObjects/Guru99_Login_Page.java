package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99_Login_Page {
	private static WebElement element = null;
	 
    public static WebElement Enter_UserName(WebDriver driver){
 
         element = driver.findElement(By.cssSelector("input[type='text']"));
 
         return element;
 
         }
    public static WebElement Enter_Password(WebDriver driver){
    	 
    	element = driver.findElement(By.cssSelector("input[type='password']"));

        return element;

        }
    public static WebElement Login(WebDriver driver){
   	 
    	element = driver.findElement(By.cssSelector("input[type='submit']"));

        return element;

        }
}
