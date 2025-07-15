package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollBottomHeight {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.worldometers.info/geography/flags-of-the-world");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ind = driver.findElement(By.xpath("//img[@alt='India']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		/*
		 * jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 * Thread.sleep(3000);
		 * jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		 */
		// scrollToByWebelement
		// jse.executeScript("arguments[0].scrollIntoView(true)", ind);
		jse.executeScript("arguments[0].scrollIntoView(frue)", ind);

	}

}
