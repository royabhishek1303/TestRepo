package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
//		driver.navigate().to("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement dragable = driver.findElement(By.id("droppable"));
		WebElement drag3 = driver.findElement(By.id("box3"));
		WebElement drop3 = driver.findElement(By.xpath("//div[text()='United States']"));
		WebElement drag6 = driver.findElement(By.id("box6"));
		WebElement drop6 = driver.findElement(By.xpath("//div[text()='Italy']"));
		WebElement drag7 = driver.findElement(By.id("box7"));
		WebElement drop7 = driver.findElement(By.xpath("//div[text()='Spain']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag3, drop3).perform();
		act.dragAndDrop(drag6, drop6).perform();

		Thread.sleep(2000);
		act.dragAndDrop(drag7, drop7).perform();

		// act.dragAndDropBy(drag, 200,100);
	}

}
