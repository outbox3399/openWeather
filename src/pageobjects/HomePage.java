package pageobjects;

public class HomePage extends BasePage{

	@FindBy(xpath = "//div[@class='clearfix']/ul/li[3]")
	private WebElement navigationApiKeys;

	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getNavAPIKeys() {
		return navigationApiKeys;

	}
}
