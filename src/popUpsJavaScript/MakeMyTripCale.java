package popUpsJavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripCale {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();

		for (;;) {
			try {

				driver.findElement(By.xpath("//div[@aria-label='Thu Dec 25 2025']")).click();
				System.out.println("Date found");
				break;

			} catch (Exception e) {
				// TODO: handle exception
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();

			}
		}
		// Alert ale = driver.switchTo().alert();

	}

}
