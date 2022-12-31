package base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.PropertiesOperation;

public class TestBase {
	BrowserFactory bf = new BrowserFactory();

	@BeforeMethod
	public void setUp() {

		DriverFactory.getInstance().setDriver(bf.createBrowserInstance("chrome"));
		WebDriver driver = DriverFactory.getInstance().getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.get(PropertiesOperation.loadProperties("url"));
	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}
}
