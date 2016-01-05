package TestSuites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PageObjects.Guru99_Login_Page;

public class Guru99_Login {
	private static Properties prop = new Properties();
	private static WebDriver driver = new FirefoxDriver();
	public static void setDriver(WebDriver driver) {
		Guru99_Login.driver = driver;
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
	System.out.println("Inside Login");
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
	
	@Test(priority=1)
    public void enter_username()
    {
		Guru99_Login_Page.Enter_UserName(driver)
				.sendKeys(prop.getProperty("username"));
    }
	@Test(priority=2)
    public void enter_password()
    {
		Guru99_Login_Page.Enter_Password(driver)
				.sendKeys(prop.getProperty("password"));
    }
	@Test(priority=3)
    public void click_login() throws IOException
    {
		Guru99_Login_Page.Login(driver).click();
		System.out
		.println(" Login Successfully, now it is the time to shop buddy");
		String title=driver.getTitle();
		System.out.println(title);
//		Assert.assertEquals("My account - My Store", title);
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\ajoyb\\Desktop\\ajoymitm\\MainProject\\src\\Screenshots\\loginsucess.png"));
    }
}
