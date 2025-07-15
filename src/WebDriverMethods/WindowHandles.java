package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/23");
		String parentId = driver.getWindowHandle();
		Thread.sleep(5000);
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		allWindowIds.remove(parentId);

		for (String allWindowId : allWindowIds) {
			driver.switchTo().window(allWindowId);
			Thread.sleep(5000);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
	}
}
