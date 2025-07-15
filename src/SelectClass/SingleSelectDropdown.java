package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
		// driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ref = driver.findElement(By.id("products-orderby"));

		Select s1 = new Select(ref);
		// ByIndex
		// s1.selectByIndex(1);

		// ByValue
		// s1.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");

		// ByVisibleText
		s1.selectByVisibleText("Price: Low to High");

	}
}
