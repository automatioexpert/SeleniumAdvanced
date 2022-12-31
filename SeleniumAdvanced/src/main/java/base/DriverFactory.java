package base;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	public static WebDriver driver;

	private DriverFactory() {

	}

	private static DriverFactory instance = new DriverFactory();

	public static DriverFactory getInstance() {
		return instance;
	}

	public static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

	public WebDriver getDriver() {
		return dr.get();

	}

	public void setDriver(WebDriver driver) {
		dr.set(driver);

	}
	
	public void closeBrowser() {
		dr.get().close();
		dr.remove();
	}

}
