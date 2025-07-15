package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		// Thread.sleep(2000);
		// driver.navigate().refresh();
		// driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> allele = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));

	}
}
