package PomRepoSitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpInformation {

	
	public SignUpInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
	private WebElement signupemailfeild;
	
	@FindBy(xpath = "//input[@data-qa=\"signup-name\"]")
	private WebElement namefeild;
	
	public WebElement getSignupemailfeild() {
		return signupemailfeild;
	}

	public WebElement getNamefeild() {
		return namefeild;
	}

	public WebElement getSignupButton() {
		return signupButton;
	}

	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	private WebElement signupButton;
	
}
