package Testcasewebpage;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.tools.Generate.ExtendedLogger;
import org.openqa.selenium.JavascriptExecutor;
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
public class Test_Cases extends Base_Support
{

    
	@Test(enabled=false,description="Test cases to verify logo_text")
	public void Testcase1() throws Exception
	{
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		pg1.verifylogo();
	}
	@Test(enabled=false,description="Test cases to verify hyperlink")// required lot of time to verify 358 link hence 
	public void Testcase2() throws Exception
	{
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		pg1.verifyhyperlink();
	}
	@Test(enabled=false,description="Test cases to verify title of homepage") 
	public void Testcase3() throws Exception
	{
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		pg1.Verifytitle();
	}


	@Test(enabled=false,description="Test cases to verify title after clicking")
	public void Testcase4() throws Exception
	{
		Home_POM pg1=PageFactory.initElements(driver,Home_POM .class);
		pg1.Tab_clickable();
	}

	@Test(enabled=true,description="Test cases to verify login page ",dataProvider="data-provider",dataProviderClass=Data.class)
	public void Testcase5(String val1,String val2) throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
	//	pg2.Enter_email("hemantpatiltech@gmail.com");
		pg2.Enter_email(val1);
		pg2.Continue();
	//	pg2.Enter_Pasword("Rohini@123");
		pg2.Enter_Pasword(val2);
		pg2.sign_in();


		pg2.sign_out();
	}


	@Test(priority=6,enabled=false,description="Test cases to verify firstname error message ")// required lot of time to verify 358 link hence 
	public void Testcase6() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname("     ");
		ht.Signup_submit();
		ht.phoneErrorcheck();

	}
	@Test(priority=7,enabled=false,description="Test cases to verify Phonenumber error message ")// required lot of time to verify 358 link hence 
	public void Testcase7() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname("testing");
		ht.Mobile_enter("");
		ht.Signup_submit();
		ht.phoneNoErrorcheck();

	}
	
	@Test(priority=8,enabled=false,description="Test cases to verify password error message ")// required lot of time to verify 358 link hence 
	public void Testcase8() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname("testing");
		ht.Mobile_enter("9028302753");
		ht.Enter_Pasword("");
		ht.Signup_submit();
		ht.paswordErrorcheck();

	}
	@Test(priority=9,enabled=false,description="Test cases to verify error message when all feild are blank ")// required lot of time to verify 358 link hence 
	public void Testcase9() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname(" ");
		ht.Mobile_enter(" ");
		ht.Enter_Pasword("");
		ht.Signup_submit();
		ht.phoneErrorcheck();
		ht.phoneNoErrorcheck();
		ht.paswordErrorcheck();

	}
	
	@Test(priority=10,retryAnalyzer = RetryExecution.class,enabled=false,description="Test cases to verify user is not able to signup with blank first name ")// required lot of time to verify 358 link hence 
	public void Testcase10() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname(" ");
		ht.Mobile_enter("845556658 ");
		ht.Enter_Pasword("llooppiujh");
		ht.Signup_submit();
		ht.MarkInvalidateChk();

	}
	@Test(priority=11,retryAnalyzer = RetryExecution.class,enabled=false,description="Test cases to verify user is not able to signup with blank mobile no ")// required lot of time to verify 358 link hence 
	public void Testcase11() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname("Test ");
		ht.Mobile_enter("  ");
		ht.Enter_Pasword("llooppiujh");
		ht.Signup_submit();
		ht.MarkInvalidateChk();

	}
	
	@Test(priority=12,retryAnalyzer = RetryExecution.class,enabled=false,description="Test cases to verify user is not able to signup with blank password ")// required lot of time to verify 358 link hence 
	public void Testcase12() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname("Test ");
		ht.Mobile_enter("9000002225");
		ht.Enter_Pasword("  ");
		ht.Signup_submit();
		ht.MarkInvalidateChk();

	}
	@Test(priority=13,retryAnalyzer = RetryExecution.class,enabled=false,description="Test cases to verify user is not able to signup with blank password & mobile no ")// required lot of time to verify 358 link hence 
	public void Testcase13() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname("Test ");
		ht.Mobile_enter("    ");
		ht.Enter_Pasword("  ");
		ht.Signup_submit();
		ht.MarkInvalidateChk();

	}
	@Test(priority=14,retryAnalyzer = RetryExecution.class,enabled=false,description="Test cases to verify user is not able to signup with blank firstname & mobile no ")// required lot of time to verify 358 link hence 
	public void Testcase14() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname(" ");
		ht.Mobile_enter("    ");
		ht.Enter_Pasword("Rohini@123");
		ht.Signup_submit();
		ht.MarkInvalidateChk();

	}
	@Test(priority=15,retryAnalyzer = RetryExecution.class,enabled=true,description="Test cases to verify user is not able to signup with blank firstname & password ")// required lot of time to verify 358 link hence 
	public void Testcase15() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname(" ");
		ht.Mobile_enter("9028302753 ");
		ht.Enter_Pasword(" ");
		ht.Signup_submit();
		ht.MarkInvalidateChk();

	}
	@Test(priority=16,retryAnalyzer = RetryExecution.class,enabled=true,description="Test cases to verify horizontal scroll by pixel ")
	@Description("Test cases to verify user can scroll horizontally")
	@Epic("Ep0019")
	@Feature("Fb Link Navigation")
	@Story("To verify on click user is switch to fb page")
	@Step("Verify fb link Navigation")
	@Severity(SeverityLevel.MINOR)
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
