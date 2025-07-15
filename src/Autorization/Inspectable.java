package Autorization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inspectable {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		// Thread.sleep(2000);
		// driver.navigate().refresh();
		// driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement keys1 = driver.findElement(By.id("twotabsearchtextbox"));
		keys1.sendKeys("cars and bikes");
		List<WebElement> allele = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));

		for (WebElement all : allele) {
			// System.out.println(all.getText());

			if (all.getText().contains("car")) {
				System.out.println(all.getText());
				all.click();
				System.out.println("enterd");
				// keys1.sendKeys(Keys.ENTER);
				break;
			}
			// break;

		}
	}
}
