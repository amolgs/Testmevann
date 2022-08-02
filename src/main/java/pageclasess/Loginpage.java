package pageclasess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@name='txtUsername']")
	private WebElement username;
	
	@FindBy(xpath="//*[@name='txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//*[@name='Submit']")
	private WebElement btn;
	
	public Loginpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logIn() throws Exception {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btn.click();
		
	}
}
 