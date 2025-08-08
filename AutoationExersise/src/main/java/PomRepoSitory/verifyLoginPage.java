package PomRepoSitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyLoginPage {
	public verifyLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a/b[text()=\"Ravindar\"]")
	private WebElement verifyloginpage;
	
	@FindBy(xpath = "//a[text()=\" Delete Account\"]")
	private WebElement deleteaccount;
	public WebElement getDeleteaccount() {
		return deleteaccount;
	}
	public WebElement getVerifyloginpage() {
		return verifyloginpage;
	}

}
