package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class YoutubeDemo {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		// driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("deva deva song");
//	WebElement cross = driver.findElement(By.xpath("//button[@class='ytSearchboxComponentClearButton']"));
//	//cross.sendKeys("deva deva song");
//	//driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(cross)).click();
		driver.findElement(By.xpath("//button[@title='Search' and @class='ytSearchboxComponentSearchButton']")).click();
		driver.findElement(By.xpath(
				"//a[@id='video-title' and @title='Deva Deva - Extended Film Version|Brahmāstra|Amitabh B|Ranbir |@aliabhatt|@pritam7415 |Arijit|Jonita']"))
				.click();

	}
}
