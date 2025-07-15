package HandlerAttributeTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 2)
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Reporter.log("Login Successfully", true);
		Thread.sleep(3000);
		driver.quit();

	}

}
