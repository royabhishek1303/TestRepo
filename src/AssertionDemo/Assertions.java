package AssertionDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assertions {

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

		if (act.equals(expt)) {
			System.out.println("Test case pass");
		} else
			System.out.println("Test cases fail");
	}

}
