package testclasess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageclasess.Loginpage;

public class BaseTest {

	static WebDriver driver;
	Loginpage lip;
	
	@BeforeSuite
	public void launchURL() {
		WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--start-maximized");
//		options.addArguments("--disable-notifications");
//		driver=new ChromeDriver(options);
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void creationObject() {
		lip=new Loginpage(driver);
		
	}
	
}
