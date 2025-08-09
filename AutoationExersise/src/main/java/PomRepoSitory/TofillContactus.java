package PomRepoSitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TofillContactus {

	public TofillContactus(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
	private WebElement verifyGetTouch;

	@FindBy(name = "name")
	private WebElement namefield;
	@FindBy(name = "email")
	private WebElement emailfield;
	@FindBy(name = "subject")
	private WebElement subject;
	@FindBy(name = "message")
	private WebElement message;
	@FindBy(xpath = "//input[@type=\"file\"]")
	private WebElement fileupload;
	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement submit;

	public WebElement getNamefield() {
		return namefield;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getFileupload() {
		return fileupload;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getVerifyGetTouch() {
		return verifyGetTouch;
	}
}