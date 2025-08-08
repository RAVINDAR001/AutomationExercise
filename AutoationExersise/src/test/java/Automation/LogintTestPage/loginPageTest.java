package Automation.LogintTestPage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericFileUtility.BaseClass;
import GenericFileUtility.PropertyFileUtilty;
import GenericFileUtility.WebDriverUtility;
import PomRepoSitory.loginpagerepo;
import PomRepoSitory.verifyLoginPage;
import PomRepoSitory.SignupPage;
import PomRepoSitory.deleteaccount;

public class loginPageTest extends BaseClass {

	@Test(dependsOnMethods = {"AutomationexersisePageTest.SignupTest.TotestSignup"})
	public void ToTestLoginPage() throws IOException, InterruptedException {

		WebDriverUtility wutil = new WebDriverUtility();
		PropertyFileUtilty putil = new PropertyFileUtilty();
		SignupPage sp = new SignupPage(driver);

		sp.getSignup().click();
		Reporter.log("sucsessfully click on login link", true);

		PropertyFileUtilty putil1 = new PropertyFileUtilty();
		String USERNAME = putil1.ToReaddataFromProperty("username");
		String PASSWORD = putil1.ToReaddataFromProperty("password");
		loginpagerepo lpr = new loginpagerepo(driver);
		lpr.getEmailfield().sendKeys(USERNAME);
		lpr.getPassfield().sendKeys(PASSWORD);
		Thread.sleep(2000);
		lpr.getLoginbutton().click();
		Reporter.log("login sucsessfully", true);

		verifyLoginPage vlp = new verifyLoginPage(driver);
		String verify = vlp.getVerifyloginpage().getText();
		Reporter.log(verify, true);

		vlp.getDeleteaccount().click();
		Reporter.log("delet sucseesfully", true);

		deleteaccount dc= new deleteaccount(driver);
		String veifydelete = dc.getVerifydeleteaccount().getText();
		Reporter.log(veifydelete,true);
	}

}
