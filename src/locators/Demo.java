package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Abhishek");
		driver.findElement(By.id("LastName")).sendKeys("rajput");
		driver.findElement(By.id("Email")).sendKeys("ar3939@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("Abhi@83shek");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Abhi@83shek");
		driver.findElement(By.id("register-button")).click();

	}
}
