package PomRepoSitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedSucsessfull {

	public AccountCreatedSucsessfull(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//b[text()=\"Account Created!\"]")
	private WebElement creadedsucsessfully;
	public WebElement getCreadedsucsessfully() {
		return creadedsucsessfully;
	}
}
