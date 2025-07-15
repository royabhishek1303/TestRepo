package ConfigurationAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;

	@Test
	public void TC001() {
		Reporter.log("TC001 exeuted ", true);
	}

	@Test
	public void TC002() {
		Reporter.log("TC002 exeuted ", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.id("username")).sendKeys("12344");
		driver.findElement(By.id("password")).sendKeys("abhihsek");
		Reporter.log("Login action ", true);

	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("Logout action ", true);

	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Reporter.log("Opening browser", true);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		Reporter.log("Closing browser", true);

	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("pre condition ", true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("post condition ", true);

	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Data bases conctivity open", true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("Close the connection", true);
	}

}
