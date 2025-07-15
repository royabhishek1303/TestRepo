package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	
	@FindBy(id="email")
	private WebElement un;
	
	@FindBy(id="pass")
	private WebElement pw;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;

	public WebElement getUn() {
		return un;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
