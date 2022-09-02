package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElement List
	

	@FindBy(how = How.XPATH, using = "//input[@id='account']")WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")WebElement PHONE_NUM_ELEMENT;
	
	//Corresponding Method
	
	public void insertFullName(String fullName) {
		String insertedName= fullName+generateRandomNum(999);
		FULL_NAME_ELEMENT.sendKeys(insertedName);
	}
	
	public void selectCompanyDropdown(String company) {
		selectFromDropDown(COMPANY_DROPDOWN_ELEMENT, company);
	}
	
	public void insertEmail(String email) {
		String insertedEmail = generateRandomNum(9999)+ email;
				EMAIL_ELEMENT.sendKeys(insertedEmail);
	}
	public void insertPhone(String phone) {
		PHONE_NUM_ELEMENT.sendKeys(phone+generateRandomNum(9999));
	}
	
	
	
	
	
	
}
