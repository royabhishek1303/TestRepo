package Practice;

import java.io.FileInputStream;
import java.io.IOException;

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

public class DdtFb {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\LoginTest.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("login");
		Row r = sh.getRow(1);
		//System.out.println(r);
		
		//DataFormatter
		
		DataFormatter formatter = new DataFormatter();
		String un = formatter.formatCellValue(r.getCell(1)); // Preserves the original number format
		System.out.println(un);
		
		String pw = formatter.formatCellValue(r.getCell(2));


//		double un =  r.getCell(1).getNumericCellValue();
//		//String url = String.valueOf(phoneNumber);
//		System.out.println(un);
		String url = r.getCell(0).getStringCellValue();
		System.out.println(url);
//		long pw = (long) r.getCell(2).getNumericCellValue();
//		System.out.println(pw);
		
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		WebElement eye = driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']"));
		//eye.click();
		Actions act = new Actions(driver);
		act.clickAndHold(eye).perform();
		Thread.sleep(5000);
		act.release().perform();

		
	}

}
