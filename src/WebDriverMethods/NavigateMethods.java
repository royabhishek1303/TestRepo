package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	public static void main(String[] args) throws InterruptedException {

		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.shoppersstack.com/products_page/23");
			Thread.sleep(5000);
			driver.findElement(By.name("loginBtn")).click();
			Thread.sleep(5000);

			driver.navigate().back();
			Thread.sleep(5000);

			driver.navigate().refresh();
			Thread.sleep(5000);
			driver.quit();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("program ended");
		}
	}
}
