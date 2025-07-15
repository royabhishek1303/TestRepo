package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePropertiesfile {
	public static void main(String[] args) throws IOException {
		FileInputStream pis = new FileInputStream("C:\\Users\\Abhishek1\\Downloads\\commonData.properties");
		Properties pro = new Properties();
		pro.load(pis);

		String BROWSER = pro.getProperty("Browser");
		String URL = pro.getProperty("Url");

		String USERNAME = pro.getProperty("Username");
		String PASSWORD = pro.getProperty("Password");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

		WebDriver driver = new ChromeDriver();

		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);

	}

}
