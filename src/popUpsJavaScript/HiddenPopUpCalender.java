package popUpsJavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopUpCalender {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("ddate")).click();

		for (;;) {
			try {
				driver.findElement(By.id("fst_3_03/09/2025")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
			}
		}
	}

}
