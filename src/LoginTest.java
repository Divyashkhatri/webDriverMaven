package webdriverMaven;
// this project is designed for grid practice
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest
{
	public static WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		driver =new FirefoxDriver();
	}
	@Test
	public void doLogin()
	{
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("divyashk5@gmail.com");
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
}