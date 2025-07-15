package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMehtods {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//	driver.get("https://demowebshop.tricentis.com/login");
//	driver.manage().window().maximize();
//	Thread.sleep(5000);
////	driver.manage().window().minimize();
//	//driver.manage().window().fullscreen();
//     Dimension size = driver.manage().window().getSize();
//     System.out.println(size);
//     System.out.println(size.getHeight());
//     System.out.println(size.getWidth());
		// Dimension size = new Dimension(500, 500);
		// driver.manage().window().setSize(new Dimension(100, 100));
		Point pos = new Point(6, 10);
		driver.manage().window().setPosition(pos);
		// System.out.println(pos);
//	System.out.println(pos);
//	System.out.println(pos.getX()x);
//	System.out.println(pos.x);
		// System.out.println(pos.y);
	}
}
