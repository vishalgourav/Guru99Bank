package TestSuites;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.Guru99_Login_Page;

public class Guru99_Login_valid {
	private static Properties prop = new Properties();
	WebDriver driver=Guru99_Login_invalid.getDriver();
			@Test(priority=4)
    public void enter_credentials()
    {
		System.out.println("Valid Login scenario");
		Guru99_Login_Page.Enter_UserName(driver)
				.sendKeys(prop.getProperty("username"));
		Guru99_Login_Page.Enter_Password(driver)
		.sendKeys(prop.getProperty("password"));
    }
	
	@Test(priority=5)
    public void click_login() throws IOException
    {
		Guru99_Login_Page.Login(driver).click();
		String title=driver.getTitle();
		System.out.println(title);
//		Assert.assertEquals("My account - My Store", title);
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Auto_Ajoy\\Guru99Bank\\src\\Screenshots\\testsuccess.jpeg"));
   driver.close();
    }
}
