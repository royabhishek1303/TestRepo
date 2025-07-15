package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo7 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
//		driver.navigate().to("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.linkText("Create Your Own Jewelry")).click();
		driver.findElement(By.id("add-to-cart-button-71")).click();
		WebElement notify = driver.findElement(By.id("bar-notification"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = notify.getScreenshotAs(OutputType.FILE);
		File perm = new File("./errorshots/demo.png");
		FileHandler.copy(temp, perm);

	}

}
