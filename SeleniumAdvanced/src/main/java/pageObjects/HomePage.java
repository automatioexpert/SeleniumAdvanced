package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//ul[@class='page-sidebar-menu']/li/a/i/following-sibling::span[text()='Tasks']")
	private WebElement subMenu_Tasks;

	
}
