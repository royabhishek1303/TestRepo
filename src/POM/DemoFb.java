package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFb {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\LoginTest.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("login");
		Row r = sh.getRow(1);
		DataFormatter formatter = new DataFormatter();
		String un = formatter.formatCellValue(r.getCell(1)); // Preserves the original number format
		String pw = formatter.formatCellValue(r.getCell(2));
        String url = r.getCell(0).getStringCellValue();
		
		
		
		//actual script
		
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);
		
		// fetch WE from POM class
		LoginPage lp = new LoginPage(driver);
		lp.getUn().sendKeys(un);
		lp.getPw().sendKeys(pw);
		lp.getLoginButton().click();

		
		
		
		
		
	}

}
