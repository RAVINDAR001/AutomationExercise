package PomRepoSitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatecontactUs {
	
	public CreatecontactUs(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()=\" Contact us\"]")
	private WebElement contactUs;
	
	
	public WebElement getContactUs() {
		return contactUs;
	}
	
	
}
