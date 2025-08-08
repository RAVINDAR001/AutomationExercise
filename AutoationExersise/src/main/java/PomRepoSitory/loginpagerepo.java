package PomRepoSitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagerepo {
	
	
		public loginpagerepo(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(name =  "email")
		private WebElement Emailfield;
		
		@FindBy(name = "password")
		private WebElement passfield;
		
		@FindBy(xpath = "//button[@data-qa=\"login-button\"]")
		private WebElement loginbutton;
		
		public WebElement getEmailfield() {
			return Emailfield;
		}
		public WebElement getPassfield() {
			return passfield;
		}
		public WebElement getLoginbutton() {
			return loginbutton;
		}

	}



