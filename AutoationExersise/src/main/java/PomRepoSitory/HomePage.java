package PomRepoSitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\" Signup / Login\"]")
	private WebElement signup;

	public WebElement getSignup() {
		return signup;
	}
	@FindBy(xpath = "//a[text()=\" Contact us\"]")
	private WebElement contactUs;
	
	@FindBy(xpath = "//a[normalize-space()='Home']")
	private WebElement homelink;
	
	
	public WebElement getHomelink() {
		return homelink;
	}


	public WebElement getContactUs() {
		return contactUs;
	}
	
}
