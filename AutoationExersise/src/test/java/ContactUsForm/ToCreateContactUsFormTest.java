package ContactUsForm;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericFileUtility.BaseClass;
import GenericFileUtility.ExcelFileutility;
import GenericFileUtility.WebDriverUtility;
import PomRepoSitory.HomePage;
import PomRepoSitory.TofillContactus;
import PomRepoSitory.verifyLoginPage;

public class ToCreateContactUsFormTest extends BaseClass {

	@Test
	public void createcontactt() throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriverUtility wutil = new WebDriverUtility();
		ExcelFileutility eutil = new ExcelFileutility();
		HomePage hp = new HomePage(driver);
		hp.getContactUs().click();
		TofillContactus tfc = new TofillContactus(driver);
		String verify = tfc.getVerifyGetTouch().getText();

		Reporter.log(verify, true);
		String name = eutil.toReadDataFromExcelFile("ContactUs", 0, 0);
		tfc.getNamefield().sendKeys(name);
		
		Thread.sleep(2000);
		
		 String email1 = eutil.toReadDataFromExcelFile("ContactUs", 0, 1);
		tfc.getEmailfield().sendKeys(email1);
		Thread.sleep(1000);
		String subject = eutil.toReadDataFromExcelFile("ContactUs", 0, 2);
		tfc.getSubject().sendKeys(subject);
		Thread.sleep(1000);
		String message = eutil.toReadDataFromExcelFile("ContactUs", 0, 3);
		
		tfc.getMessage().sendKeys(message);
		Thread.sleep(1000);
		
		tfc.getFileupload().sendKeys("C:\\Users\\kumar\\Downloads");
		
		Thread.sleep(3000);
		
		
		tfc.getSubmit().click();
		Thread.sleep(3000);
		
		wutil.ToHandleAlertPopUpAndAccept(driver);
		Thread.sleep(3000);
		hp.getHomelink().click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
