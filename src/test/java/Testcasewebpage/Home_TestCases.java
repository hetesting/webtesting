package Testcasewebpage;

//import static org.testng.Assert.assertTrue;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
//import org.apache.logging.log4j.core.tools.Generate.ExtendedLogger;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utiltywebpage.Listner;
import Utiltywebpage.RetryExecution;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pomwebpage.Home_POM;
import pomwebpage.Login_pom;
import pomwebpage.Signup_Pom;

@Listeners(Listner.class)
public class Home_TestCases extends Base_Support
{

    
	@Test(enabled=false,description="Test cases to verify logo_text")
	public void Testcase1() throws Exception
	{
		 DesiredCapabilities capability=new DesiredCapabilities();
		 capability.setBrowserName("chrome");
		 capability.setPlatform(Platform.XP);
		 driver=new RemoteWebDriver(new URL("http://192.168.224.25:4444/wd/hub"),capability);
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		pg1.verifylogo();
	}
	@Description("Test cases to verify hyperlink")
	@Epic("Ep0001")
	@Feature("Home_Page_hyperlink")
	@Story("To verify hyperlink")
	@Step("Verify Hyperlink")
	@Severity(SeverityLevel.MINOR)
	@Test(enabled=false,description="Test cases to verify hyperlink")// required lot of time to verify 358 link hence 
	public void Testcase2() throws Exception
	{
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		pg1.verifyhyperlink();
	}
	@Description("Test cases to verify page title of homepage")
	@Epic("Ep0001")
	@Feature("Home_Page")
	@Story("To verify page title")
	@Step("Verify titile ofpage")
	@Severity(SeverityLevel.MINOR)
	@Test(enabled=false,description="Test cases to verify title of homepage") 
	public void Testcase3() throws Exception
	{
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		pg1.Verifytitle();
	}

	@Description("Test cases to verify page title after clicking")
	@Epic("Ep0019")
	@Feature("Page Scrolling")
	@Story("To verify page title")
	@Step("Verify fb link Navigation")
	@Severity(SeverityLevel.MINOR)
	@Test(enabled=false,description="Test cases to verify title after clicking")
	public void Testcase4() throws Exception
	{
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		pg1.Tab_clickable();
	}

	@Description("Test cases to verify user can scroll horizontally")
	@Epic("Ep0019")
	@Feature("Page Scrolling")
	@Story("To verify on click user is switch to fb page")
	@Step("Verify fb link Navigation")
	@Severity(SeverityLevel.MINOR)
	@Test(priority=16,retryAnalyzer = RetryExecution.class,enabled=true,description="Test cases to verify horizontal scroll by pixel ")
	public void Testcase16() throws Exception
	{
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		pg1.horizontal_Swipe();
	}
	
	@Test(priority=17,retryAnalyzer = RetryExecution.class,enabled=false,description="Test cases to verify on click fb link it is directed to fb page")
	@Description("Test cases to verify on click fb link it is directed to fb page")
	@Epic("Ep0019")
	@Feature("Fb Link Navigation")
	@Story("To verify on click user is switch to fb page")
	@Step("Verify fb link Navigation")
	@Severity(SeverityLevel.MINOR)
	public void Testcase17() throws Exception
	{
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		pg1.horizontal_Swipe();
		pg1.naviafteFb();
		
	}
	@Test(priority=18,enabled=true,retryAnalyzer = RetryExecution.class,description="Test cases to verify on click twitter link it is directed to twitter page")
	@Description("Test cases to verify on click twitter link it is directed to twitter page")
	@Epic("Ep0018")
	@Feature("Twitter Link Navigation")
	@Story("To verify on click user is switch to twittter page")
	@Step("Verify twitter link Navigation")
	@Severity(SeverityLevel.MINOR)
	public void Testcase18() throws Exception
	{
//		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
//		pg1.horizontal_Swipe();
//		pg1.naviagate_twitter();
	   Logger log=(Logger) LogManager.getLogger();
		
		log.info("Verify insta link navigation going on");
		log.error("error");
		log.warn("warning");
		System.out.println("logging done");
	}
	@Test(priority=19,retryAnalyzer = RetryExecution.class,enabled=false,description="Test cases to verify on click insta link it is directed to twitter page")
	@Description("Test cases to verify on click insta link it is directed to insta page")
	@Epic("Ep0018")
	@Feature("Insta Link Navigation")
	@Story("To verify on click user is switch to insta page")
	@Step("Verify insta link Navigation")
	@Severity(SeverityLevel.MINOR)
	public void Testcase19() throws Exception
	{
		
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		
		pg1.horizontal_Swipe();
		pg1.naviagate_instagram();
		
		Logger log=(Logger) LogManager.getLogger("Test_Cases");
		log.info("Verify insta link navigation going on");
		log.error("error");
		log.warn("warning");
		System.out.println("logging done");
		
	}
}
