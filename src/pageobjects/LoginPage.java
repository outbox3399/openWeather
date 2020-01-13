package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(id = "user_email")
	private WebElement txtBoxUserName;

	@FindBy(id = "user_password")
	private WebElement txtBoxpassWord;

	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement btnLogin;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String user, String pass) {
		txtBoxUserName.sendKeys(user);
		txtBoxpassWord.sendKeys(pass);
		btnLogin.click();
	}
}
