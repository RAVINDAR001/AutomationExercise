package AutomationexersisePageTest;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericFileUtility.BaseClass;
import GenericFileUtility.ExcelFileutility;
import GenericFileUtility.PropertyFileUtilty;
import GenericFileUtility.WebDriverUtility;
import PomRepoSitory.AccountCreatedSucsessfull;
import PomRepoSitory.SignUpAccountInformation;
import PomRepoSitory.SignUpInformation;
import PomRepoSitory.HomePage;
import io.netty.handler.timeout.TimeoutException;

public class SignupTest extends BaseClass {

	@Test(enabled = false)
	public void TotestSignup() throws IOException {

		PropertyFileUtilty putil = new PropertyFileUtilty();
		WebDriverUtility wutil = new WebDriverUtility();
		HomePage sp = new HomePage(driver);
		try {	
		sp.getSignup().click();
		Reporter.log("sucsessfully click on signup link", true);

		SignUpInformation sip = new SignUpInformation(driver);
		WebElement name = sip.getNamefeild();

		WebElement signup = sip.getSignupemailfeild();
		ExcelFileutility eutil = new ExcelFileutility();
		String namefield = eutil.toReadDataFromExcelFile("Sheet1", 0, 0);

		name.sendKeys(namefield);

		String emailfield = eutil.toReadDataFromExcelFile("Sheet1", 1, 0);
		signup.sendKeys(emailfield);
		sip.getSignupButton().click();

		Reporter.log("Click on submit button sucsess", true);

		SignUpAccountInformation saip = new SignUpAccountInformation(driver);
		saip.getRadiobutton().click();
		// WebElement pass = saip.getPasswordfield();
		String Password = eutil.toReadDataFromExcelFile("Sheet2", 1, 0);

		saip.getPasswordfield().sendKeys(Password);
		// saip.getDays().click();
		wutil.ToHandleDropdown(saip.getDays(), 13);

		wutil.ToHandleDropdown(saip.getMonths(), 6);
		wutil.ToHandleDropdown(saip.getYear(), "1995");

		// WebElement firstname = saip.getFirstname();
		String firstnamefill = eutil.toReadDataFromExcelFile("Sheet2", 1, 1);
		saip.getFirstname().sendKeys(firstnamefill);
		String lastname = eutil.toReadDataFromExcelFile("Sheet2", 1, 3);
		saip.getLastname().sendKeys(lastname);
		
		String Address = eutil.toReadDataFromExcelFile("Sheet2", 1, 2);
		saip.getAddress().sendKeys(Address);
		
		String state = eutil.toReadDataFromExcelFile("Sheet2", 1, 4);
		saip.getState().sendKeys(state);
		String city = eutil.toReadDataFromExcelFile("Sheet2", 1, 5);
		saip.getCity().sendKeys(city);
		String Zipcode = eutil.toReadDataFromExcelFile("Sheet2", 1, 6);
		saip.getZipcode().sendKeys(Zipcode);

		String mobilenumber = eutil.toReadDataFromExcelFile("Sheet2", 1, 7);
		saip.getMobilenumber().sendKeys(mobilenumber);
		saip.getSubmitbuttonforcteateaccount().click();
		
		Reporter.log("Signup completed",true);
		
		
		AccountCreatedSucsessfull accs= new AccountCreatedSucsessfull(driver);
		String create = accs.getCreadedsucsessfully().getText();
		Reporter.log(create,true);
		//AssertJUnit.assertTrue(create.contains());
		
		}
		catch (TimeoutException e) {
			Reporter.log("page took to long time");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			Reporter.log("no element found ",true);
		}
	}

}
