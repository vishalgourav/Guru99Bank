package TestSuites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.Guru99_Login_Page;
import TestData.TestData1;

public class Guru99_Login_invalid {
	private static Properties prop = new Properties();
	private static WebDriver driver = new FirefoxDriver();
	public static void setDriver(WebDriver driver) {
		Guru99_Login_invalid.driver = driver;
	}
	public static Properties getProp() {
		return prop;
	}
	public static WebDriver getDriver() {
		return driver;
	}
	@BeforeSuite
	public static void login() throws IOException 
{
	System.out.println("Inside Invalid Login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File file = new File(
			"D:\\Auto_Ajoy\\Guru99Bank\\src\\Config\\Config.properties");
		FileInputStream fileInput = null;
	try 
	{
		fileInput = new FileInputStream(file);

		prop.load(fileInput);
	} 
	
	catch (IOException e) 
	{
		e.printStackTrace();
	}
	
}
	
	@Test(priority=0)
	public void geturl()
    {
		driver.get(prop.getProperty("url"));
    }
	
	@Test(dataProvider="getData",dataProviderClass=TestData1.class,priority=1)
    public void enter_credentials(String username, String password)
    {
		Guru99_Login_Page.Enter_UserName(driver)
		.sendKeys(username);
Guru99_Login_Page.Enter_Password(driver)
.sendKeys(password);
Guru99_Login_Page.Reset(driver).click();
    }
}

