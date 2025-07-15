package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DisableElement {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("jdk-23.0.2_doc-all.zip")).click();
		WebElement disable = driver.findElement(By.linkText("Download jdk-23.0.2_doc-all.zip"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", disable);
//		Thread.sleep(3000);
//		jse.executeScript("window.scrollTo(0,500)");
	}

}
