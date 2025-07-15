package ScreebShotWebpage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// typecasting

		TakesScreenshot ts = (TakesScreenshot) driver;
		// store in temp

		File temp = ts.getScreenshotAs(OutputType.FILE);

		File perm = new File("./errorShots/BR.png");

		FileHandler.copy(temp, perm);

	}

}
