package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class HomeScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.youtube.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ref = driver.findElement(By.id("endpoint"));
		File temp = ref.getScreenshotAs(OutputType.FILE);
		File perp = new File("./errorshots/youtube.png");
		FileHandler.copy(temp, perp);

	}

}
