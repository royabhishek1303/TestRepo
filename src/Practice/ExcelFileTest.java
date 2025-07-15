package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFileTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Abhishek1\\Downloads\\TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Login2");
		// Row r = sh.getRow(1);
		String url = sh.getRow(1).getCell(0).getStringCellValue();
		String un = sh.getRow(1).getCell(1).getStringCellValue();
		String pwd = sh.getRow(1).getCell(2).getStringCellValue();

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.stealmylogin.com/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);

		//// System.out.println(url);
		// System.out.println(r);
	}

}
