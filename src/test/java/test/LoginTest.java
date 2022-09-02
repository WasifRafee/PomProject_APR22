package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		String userName = "demo@techfios.com" ,password = "abc123";
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignIn();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		
		dashboardPage.validateDashboardPage();
		
		BrowserFactory.tearDown();
		
		//https://github.com/techfios-git/PomProject_Apr22.git

	}
	
}
