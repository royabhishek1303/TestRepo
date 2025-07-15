package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDOwnANdup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("small-searchterms"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).click(ele).keyDown(Keys.SHIFT).sendKeys("mobiles").keyUp(Keys.SHIFT).sendKeys("computer")
				.perform();
	}

}
