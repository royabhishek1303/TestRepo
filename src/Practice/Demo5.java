package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		// driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ref = driver.findElement(By.id("state"));
		Select state = new Select(ref);
		state.selectByVisibleText("Uttar Pradesh");
		WebElement ref2 = driver.findElement(By.id("city"));
		Select city = new Select(ref2);
		city.selectByVisibleText("Lucknow");

	}

}
