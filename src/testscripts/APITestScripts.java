package testscripts;


import pageobjects.APIKeysPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class APITestScripts {

	
	LoginPage loginPage;
	HomePage homePage;
	APIKeysPage apiKeysPage;
	
	
	public APITestScripts() {
		loginPage = new LoginPage();
		homePage = new HomePage();
		apiKeysPage = new APIKeysPage();

	}
	
	@Test
	public void verifyCreateAPI(){
		loginPage.login("wizetest1@gmail.com", "autotest");
		homePage.getNavAPIKeys().click();
		
		// Create Keys
		apiKeysPage.setCreateKeyName("testuser");
		Thread.Sleep(3000)
		apiKeysPage.getKeyGenerateButton().click();
		Thread.Sleep(3000)
		Assert.assertTrue("Failed: Keys was not created",
				apiKeysPage.getAPICreatedSuccessfulMessage().getText().equalsIgnoreCase("API key was created successfully"));
		
		// Edit Keys
		apiKeysPage.getKeyEditAPI().click();
		Thread.Sleep(3000)
		apiKeysPage.setEditNewAPIName("testussser");
		Thread.Sleep(3000)
		apiKeysPage.getButtonAPIEdit().click();
		Thread.Sleep(4000)
		Assert.assertTrue("Failed: Keys was not edited",
				apiKeysPage.getAPIEditedSuccessfulMessage().getText().equalsIgnoreCase("API key was edited successfully"));
		
		//Delete Keys
		apiKeysPage.getDeleteAPI().click();
		Thread.Sleep(4000)
		((IJavaScriptExecutor)driver).ExecuteScript("arguments[0].click()", element);
		IAlert confirmationAlert = driver.SwitchTo().Alert();
		Thread.Sleep(4000)
		confirmationAlert.Accept();
		Thread.Sleep(4000)
		Assert.assertTrue("Failed: Keys was not deleted",
				apiKeysPage.getAPIDeletedSuccessfulMessage().getText().equalsIgnoreCase("API key was deleted successfully"));
		

	}
}
