package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUseGetMethod {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
//	String title = driver.getTitle();
//	System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
