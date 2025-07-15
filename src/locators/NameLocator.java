package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techbeamers.com/selenium-practice-test-page/");
		Thread.sleep(10000);
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("email")).sendKeys("Password123");
	}
}
