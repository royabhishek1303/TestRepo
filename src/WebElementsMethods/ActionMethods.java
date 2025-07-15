package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ActionMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://spinachnewdev.rezo.ai/");
		// driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		// get text
		/*
		 * driver.findElement(By.partialLinkText("Books")).click();
		 * driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		 * Thread.sleep(2000); String text =
		 * driver.findElement(By.className("content")).getText();
		 * System.out.println(text);
		 *
		 * // getAttribute
		 *
		 * @Nullable String text =
		 * driver.findElement(By.linkText("Log in")).getAttribute("class");
		 * System.out.println(text);
		 *
		 *
		 *
		 * //getTagname() //String text =
		 * driver.findElement(By.linkText("Log in")).getTagName(); String text
		 * =driver.findElement(By.id("small-searchterms")).getTagName();
		 * System.out.println(text);
		 *
		 *
		 * // getCssSelector() Thread.sleep(5000); String colour =
		 * driver.findElement(By.xpath("//button[text()='Send OTP']")).getCssValue(
		 * "background-color"); System.out.println(colour);
		 *
		 *
		 * // getsize() Thread.sleep(5000); // Dimension colour =
		 * driver.findElement(By.xpath("//button[text()='Send OTP']")).getSize();
		 * Dimension size =
		 * driver.findElement(By.xpath("//span[text()='Sign in with Microsoft']")).
		 * getSize(); System.out.println(size);
		 *
		 *
		 * // getLocation() Thread.sleep(5000); // Dimension colour =
		 * driver.findElement(By.xpath("//button[text()='Send OTP']")).getSize(); Point
		 * location =
		 * driver.findElement(By.xpath("//span[text()='Sign in with Microsoft']")).
		 * getLocation(); System.out.println(location);
		 */
		// getRect()

		// Dimension colour = driver.findElement(By.xpath("//button[text()='Send
		// OTP']")).getSize();
		Rectangle rec = driver.findElement(By.xpath("//span[text()='Sign in with Microsoft']")).getRect();
		System.out.println(rec.getHeight());
		System.out.println(rec.getDimension());
		System.out.println(rec.getPoint());
		System.out.println(rec.getY());

	}
}
