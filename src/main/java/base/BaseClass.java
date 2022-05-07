package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import commons.AllActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.GetQuatoPage;
import objects.LandingPage;
import objects.ZipCodePage1;
import objects.ZipCodePage2;

public class BaseClass {
	public static WebDriver driver;
	public AllActions allActions;
	public LandingPage landingPage;
	public ZipCodePage1 zipCodePage1;
	public GetQuatoPage getQuatoPage;
	public ZipCodePage2 zipCodePage2;
	
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amfam.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initClasses();
	}
	
	@AfterMethod
	public void cleaningUp() {
		driver.quit();
	}
	
	public void initClasses() {
		allActions = new AllActions();
		landingPage = new LandingPage(driver);
		zipCodePage1 = new ZipCodePage1(driver);
		getQuatoPage = new GetQuatoPage(driver);
		zipCodePage2 = new ZipCodePage2(driver);
		
	}

}
