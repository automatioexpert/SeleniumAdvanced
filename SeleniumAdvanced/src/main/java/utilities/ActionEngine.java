package utilities;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import base.ExtentFactory;

public class ActionEngine {

	public void sendKeys(WebElement element, String fieldName, String value) {

		try {
			element.sendKeys(value);
			ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName + "==> Entered value as: " + value);
		} catch (Exception e) {
			// log failure in extent report
			ExtentFactory.getInstance().getExtent().log(Status.FAIL,
					"Value enter in field: " + fieldName + " is failed due to exception: ");

		}

	}

	public void click(WebElement element) {
		try {
			element.click();
			ExtentFactory.getInstance().getExtent().log(Status.PASS, "==> Clicked on: " + element);
		} catch (Exception e) {
			// log failure in extent report
			ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Failed to click due to Exception");

		}

	}
}
