package popUpsJavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadFile {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531 ");
		driver.findElement(By.xpath("//h2[contains(text(),\"I'm experienced\")]")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys(
				"C:\\Users\\Abhishek1\\OneDrive - Corrz Technosolutions Private Limited\\Attachments\\Salary_revision_letter_Abhishek._R232.pdf");
	}

}
