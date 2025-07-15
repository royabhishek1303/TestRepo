package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToLocation {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.selenium.dev/selenium/web/mouse_interaction.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// WebElement drag = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		act.moveToLocation(300, 939).perform();
	}

}
