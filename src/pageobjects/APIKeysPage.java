package pageobjects;

public class APIKeysPage extends BasePage{
	
	@FindBy(id = "api_key_form_name")
	private WebElement textBoxCreatekeyName;
	
	@FindBy(xpath = "//input[@value='Generate']")
	private WebElement buttonGenerate;
	
	@FindBy(xpath = "//div[@class='panel-body']")
	private WebElement txtAPICreatedSuccessfulMessage;
	
	@FindBy(xpath = "(//a[@class='btn btn-default btn-xs'])[1]")
	private WebElement iconFirstAPIDelete;
	
	@FindBy(xpath = "(//a[@class='btn btn-default btn-xs edit-key-btn'])[1]")
	private WebElement iconFirstAPIEdit;
	
	@FindBy(id = "new_edit_key_form")
	private WebElement textBoxEditAPIName;
	
	@FindBy(xpath = "//button[@class='btn btn-orange']")
	private WebElement buttonAPIEdit;
	
	
	
	
	public APIKeysPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void setCreateKeyName(String keyName){
		textBoxCreatekeyName.sendkeys(keyName);
	}
	
	public WebElement getKeyGenerateButton() {
		return buttonGenerate;

	}
	
	public WebElement getAPICreatedSuccessfulMessage() {
		return txtAPICreatedSuccessfulMessage;

	}
	
	public WebElement getAPIEditedSuccessfulMessage() {
		return txtAPICreatedSuccessfulMessage;

	}
	
	public WebElement getAPIDeletedSuccessfulMessage() {
		return txtAPICreatedSuccessfulMessage;

	}
	
	public WebElement getDeleteAPI() {
		return iconFirstAPIDelete;

	}
	
	public WebElement getKeyEditAPI() {
		return iconFirstAPIEdit;

	}
	
	public void setEditNewAPIName(String newName){
		textBoxEditAPIName.clear();
		textBoxEditAPIName.sendkeys(newName);
	}
	
	public WebElement getButtonAPIEdit() {
		return buttonAPIEdit;

	}

}
