package RelativELocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativELocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

		driver.navigate().refresh();
		// WebElement com = driver.findElement(By.partialLinkText("Computers"));
		// driver.findElement(RelativeLocator.with(By.tagName("a")).above(com)).click();
		/// Thread.sleep(2000);
		// WebElement cart = driver.findElement(By.id("nav-cart-count-container"));
		WebElement ret = driver.findElement(By.id("nav-orders"));

		// driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(jwl)).click();
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(ret)).click();
	}
}
