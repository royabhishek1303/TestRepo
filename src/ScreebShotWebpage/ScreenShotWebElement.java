package ScreebShotWebpage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotWebElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ref = driver.findElement(By.xpath(
				"//span[text()='Sign in' ]/ancestor::span[@class='a-button a-spacing-mini a-spacing-top-mini a-button-span2 a-button-primary']"));
		File temp = ref.getScreenshotAs(OutputType.FILE);
		File perm = new File("./errorshots/sign1.png");
		FileHandler.copy(temp, perm);

	}

}
