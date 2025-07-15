package xPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByAttributeText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Log in")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	}
}
