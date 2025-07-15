package ParellSuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void amazon() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.amazon.com/");

	}

}
