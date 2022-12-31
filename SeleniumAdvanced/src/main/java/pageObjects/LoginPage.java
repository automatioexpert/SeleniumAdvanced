package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// administrator@localhost.com
	// administrator

	@FindBy(name = "login[email]")
	private WebElement emailTextBox;

	@FindBy(name = "login[password]")
	private WebElement passwordTextBox;

	@FindBy(css = "button[type='submit']")
	private WebElement loginBtn;

	// Initialize all page objects with driver instance

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//login to App
	public void login(String username, String password) {
		emailTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		loginBtn.click();
	}
}
