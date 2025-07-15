package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/Abhishek1/Downloads/text.html");
		// driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ref = driver.findElement(By.id("boeing-aircraft"));

		Select s1 = new Select(ref);
		s1.selectByIndex(0);
//		s1.selectByValue("b717");
//		s1.selectByVisibleText("Boeing 737");

		Thread.sleep(2000);
		// s1.equals(s1);

//		s1.deselectByIndex(0);
//		s1.deselectByValue("b717");
//		s1.deselectByVisibleText("Boeing 737");
		s1.deselectAll();
//		System.out.println(s1.isMultiple());
//		System.out.println(s1.getFirstSelectedOption().getText());
//		List<WebElement> list = s1.getAllSelectedOptions();
//		for(WebElement l1 : list) {
//			System.out.println(l1.getText());
//		}

		List<WebElement> all = s1.getOptions();
		for (WebElement l1 : all) {
			System.out.print(l1.getText() + " ");
		}

	}

}
