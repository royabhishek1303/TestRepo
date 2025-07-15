package AssertionDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void login() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		String expt = "Amazo.com";
		String act = driver.getTitle();
//	System.out.println(act);
//	Assert.assertEquals(act, expt, "Title not matching");

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertNotEquals(act, expt, "Tile not matching");
		System.out.println("Step 1");
		System.out.println("Step 2");
		softAssert.assertAll();

	}
}
