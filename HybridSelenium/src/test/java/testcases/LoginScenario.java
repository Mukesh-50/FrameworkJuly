package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import factory.DataProviderFactory;
import pages.HomePage;
import pages.Logout;

public class LoginScenario extends BaseClass{

	HomePage home;
	Logout logOut;

	@Test
	public void loginSucess()
	{
		logger=report.createTest("Login To OrangeHRM");
		
		home=PageFactory.initElements(driver, HomePage.class);
		
		logOut=PageFactory.initElements(driver, Logout.class);
		
		home.verifyTitle();
		
		logger.pass("Title Verified");
		
		home.loginToApplication(DataProviderFactory.getExcel().getCellData("data", 0, 0),
				DataProviderFactory.getExcel().getCellData("data", 0, 1));
		
		logger.pass("User is able to login");
		
		logOut.verifyDashboard();
		
		logOut.clickOnWelcomeText();
		
		logOut.clickOnLogOutButton();
		
		//util.acceptAlert();
		
		
		
	}
	
	
	
	
	
}
