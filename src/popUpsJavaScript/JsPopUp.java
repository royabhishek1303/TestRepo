package popUpsJavaScript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JsPopUp {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		// driver.navigate().to("https://demo.guru99.com/test/delete_customer.php ");
		// driver.get("https://demowebshop.tricentis.com/");
		// driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath("//input[@value='Search']")).click();
//		driver.findElement(By.name("cusid")).sendKeys("12344");
//		driver.findElement(By.name("submit")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert ale = driver.switchTo().alert();
		// ale.accept();
		// ale.dismiss();
		ale.sendKeys("abhishek");
		ale.accept();
	}

}
