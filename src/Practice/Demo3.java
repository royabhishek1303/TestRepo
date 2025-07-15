package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		// driver.get("https://duckduckgo.com/");
		driver.get("http://testphp.vulnweb.com/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[text()='text']")).sendKeys("abc");
	}
}
