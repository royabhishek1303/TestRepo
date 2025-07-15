package AssertionDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {

	@Test
	public void login() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		WebElement loginText = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
		String act = loginText.getText();
		System.out.println(act);
		// driver.close();

		String expt = "Welcme, Please Sign In!";

//	Assert.assertEquals(act, expt, "Title not matching");
//	System.out.println("Step1");

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(act, expt, "Tile not matching");
		System.out.println("Step 1");
		System.out.println("Step 2");
		softAssert.assertAll();

	}

}
