package GenericFileUtility;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import PomRepoSitory.loginpagerepo;
import PomRepoSitory.HomePage;



public class BaseClass {
	
	
	public static WebDriver sdriver;
	
	PropertyFileUtilty putil=new PropertyFileUtilty();
	ExcelFileutility eutil=new ExcelFileutility();
	WebDriverUtility wutil1 =new WebDriverUtility(); 
	public WebDriver driver = null;
	HomePage hp=new HomePage(driver);
	

	@BeforeSuite(groups = {})
	public void beforeSuiteConfig() {
		Reporter.log("---Data base connection Estabilishes---", true);
	}
	
	@BeforeClass(groups = {})
	public void beforeClassConfig(/*String BROWSER*/) throws IOException {
		String BROWSER = putil.ToReaddataFromProperty("browser");
		String URL = putil.ToReaddataFromProperty("url");

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		sdriver = driver;
		Reporter.log("Browser got launch", true);

		wutil1.ToMaximize(driver);
		wutil1.WaitForElement(driver);
		driver.get(URL);
	Reporter.log("navigated to login page", true);

	}
	@AfterClass
	public void Afterclassconfig() {
		driver.quit();
		Reporter.log("Browser close sucsessfully",true);
		
		
	}
	@AfterSuite
	public void AftersuitConfig() {
		Reporter.log("--database conectivity finish--");
	}

	
		
	

}
