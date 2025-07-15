package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
	//i am abhishek
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://yonobusiness.sbi/login/yonobusinesslogin");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("password"));
		WebElement pass = driver.findElement(By.xpath(" //div[contains(@class, 'shownhide')]"));
		Actions act = new Actions(driver);
		// act.moveToElement(pass).clickAndHold().perform();
		act.clickAndHold(pass).perform();
		Thread.sleep(3000);
		act.release(pass).perform();
	
	}

}
