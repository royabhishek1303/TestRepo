package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EasyMyTrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/?rdt=true");
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='May 2025']/../..//li[@id='frth_5_23/05/2025']")).click();
	}
}
