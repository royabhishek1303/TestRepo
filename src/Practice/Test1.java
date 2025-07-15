package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("userName"));
		WebElement pwd = driver.findElement(By.id("password"));
		un.sendKeys("abhishek");
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.click(un).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.click(pwd).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		WebElement eye = driver.findElement(By.xpath("//div[contains(@class,'shownhide')]"));
		// eye.click();

		act.clickAndHold(eye).perform();
		Thread.sleep(2000);
		act.release().build().perform();

//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		driver.navigate().refresh();

//		Set<String> id = driver.getWindowHandles();
//		System.out.println(id);

	}

}
