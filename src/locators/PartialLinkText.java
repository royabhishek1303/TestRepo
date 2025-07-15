package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PartialLinkText {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText(""))
}
}
