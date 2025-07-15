package Iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameSwitch {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.dream11.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Switch driver control using int index
		// driver.switchTo().frame(0);
		// WebElement ref = driver.findElement(By.id("send-sms-iframe"));

		// switch to id or name
		// driver.switchTo().frame("send-sms-iframe");

		// switch to store the id or any iframe
		// driver.switchTo().frame(ref);

		// switch to parentFrame
		// driver.switchTo().parentFrame();

		driver.findElement(By.linkText("About Us")).click();

	}

}
