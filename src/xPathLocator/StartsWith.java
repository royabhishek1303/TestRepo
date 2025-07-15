package xPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWith {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Log in")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//input[(@value='Log in')]")).click();

		WebElement error = driver.findElement(By.xpath("//span[starts-with(text(),'Login was')]"));
		System.out.println(error.getText());
	}
}
