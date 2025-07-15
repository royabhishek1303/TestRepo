package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo4 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.shoppersstack.com/products_page/23 ");
		// driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.id("Check Delivery")).sendKeys("abc");
		driver.findElement(By.xpath("//button[text()='Check']")).click();
	}
}
