package product;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public static WebDriver driver;
	
	@BeforeClass
	public static void startUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\apps\\workspace\\FrancisAutoTest\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.davidjones.com/");
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}