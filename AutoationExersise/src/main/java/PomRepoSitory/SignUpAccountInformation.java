package PomRepoSitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpAccountInformation {
	
	public SignUpAccountInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type=\"radio\"]")
	private WebElement radiobutton;
	
	
	@FindBy(xpath = "//input[@data-qa=\"password\"]")
	private WebElement passwordfield;
	
	@FindBy(name = "days")
	private WebElement days;
	
	@FindBy(name = "months")
	private WebElement months;
	
	@FindBy(id = "years")
	private WebElement year;
	
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	
	@FindBy(id = "country")
	private WebElement country;
	
	
	@FindBy(xpath = "//input[@data-qa=\"state\"]")
	private WebElement state;
	
	
	@FindBy(id = "city")
	private WebElement city;
	
	
	@FindBy(id = "zipcode")
	private WebElement zipcode;
	
	
	@FindBy(id = "address1")
	
	private WebElement Address;
	
	
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getPasswordfield() {
		return passwordfield;
	}
	public WebElement getDays() {
		return days;
	}
	public WebElement getMonths() {
		return months;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public WebElement getMobilenumber() {
		return mobilenumber;
	}
	public WebElement getSubmitbuttonforcteateaccount() {
		return submitbuttonforcteateaccount;
	}

	@FindBy(id = "mobile_number")
	private WebElement mobilenumber;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
	private WebElement submitbuttonforcteateaccount;
	
	

}
