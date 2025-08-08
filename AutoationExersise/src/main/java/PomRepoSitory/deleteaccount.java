package PomRepoSitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deleteaccount {
public	deleteaccount(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath = "//b[text()=\"Account Deleted!\"]")
private WebElement verifydeleteaccount;
public WebElement getVerifydeleteaccount() {
	return verifydeleteaccount;
}

}
