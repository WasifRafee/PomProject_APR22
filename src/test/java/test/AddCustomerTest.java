package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	
	//Login Data
	String userName = "demo@techfios.com" ,password = "abc123";
	
	//TestData
	
	String fullName= "Java Selenium";
	String company= "Amazon";
	String email= "abc@techfios.com";
	String phoneNum= "123456";
	
	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignIn();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		
		dashboardPage.validateDashboardPage();
		Thread.sleep(5000);
		dashboardPage.clickCustomerMenuButton();
		dashboardPage.clickAddCustomerMenuButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.insertFullName(fullName);
		addCustomerPage.selectCompanyDropdown(company);
		addCustomerPage.insertEmail(email);
		addCustomerPage.insertPhone(phoneNum);
		//BrowserFactory.tearDown();
	}
	
}
