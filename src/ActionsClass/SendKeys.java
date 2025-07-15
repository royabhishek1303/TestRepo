package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("small-searchterms"));

		Actions act = new Actions(driver);
		// act.moveToElement(ele).click(ele).sendKeys("computer").perform();
		// act.click(ele).sendKeys("abhish").perform();
		act.sendKeys(ele, "abhishek").perform();
	}

}
