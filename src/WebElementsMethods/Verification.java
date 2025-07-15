package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Verification {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		// driver.get("https://duckduckgo.com/");
		driver.get("file:///C:/Users/Abhishek1/Downloads/text.html");
		driver.manage().window().maximize();
		// isDisabled

//	boolean displayed = driver.findElement(By.xpath("//button[text()='Next']")).isDisplayed();
//	System.out.println(displayed);
		// isEnabled
//	WebElement enableDisabled = driver.findElement(By.xpath("//button[@type='submit']"));
//	System.out.println(enableDisabled.isEnabled());
//	driver.findElement(By.id("searchbox_input")).sendKeys("Iphone");
//	System.out.println(enableDisabled.isEnabled());

		// isSelected

		WebElement ref = driver.findElement(By.xpath("//option[text()='Boeing 707']"));
		System.out.println(ref.isSelected());
		ref.click();
		System.out.println(ref.isSelected());
	}
}
