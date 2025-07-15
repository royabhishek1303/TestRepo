package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://spinachnewdev.rezo.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Sign in with Microsoft']")).click();
		driver.findElement(By.xpath("//button[text()='Add Spinach User']")).click();
		driver.findElement(By.id("user_name")).sendKeys("abce");
		driver.findElement(By.id("email")).sendKeys("xyz");
		WebElement admin = driver.findElement(By.xpath("//div[text()='ADMIN']"));

	}

}
