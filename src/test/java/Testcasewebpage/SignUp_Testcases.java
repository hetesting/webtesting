package Testcasewebpage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utiltywebpage.RetryExecution;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pomwebpage.Login_pom;
import pomwebpage.Signup_Pom;

public class SignUp_Testcases extends Base_Support
{
	@Description("Test cases to verify signup firstname error message")
	@Epic("Ep-0002")
	@Feature("Application Sign-up")
	@Story("To verify user get error when he enetered blank firstname")
	@Step("Verify error msg for blank firstname")
	@Severity(SeverityLevel.MINOR)
	@Test(priority=6,enabled=true,description="Test cases to verify firstname error message ",groups= {"Sanity"})// required lot of time to verify 358 link hence 
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
	@Description("Test cases to verify signup phonenumber error message")
	@Epic("Ep-0002")
	@Feature("Application Sign-up")
	@Story("To verify user get error when he enetered blank phonenumber")
	@Step("Verify error msg for blank phonenumber")
	@Severity(SeverityLevel.MINOR)
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
	@Description("Test cases to verify signup password error message")
	@Epic("Ep-0002")
	@Feature("Application Sign-up")
	@Story("To verify user get error when he enetered blank password")
	@Step("Verify error msg for blank password")
	@Severity(SeverityLevel.MINOR)
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
	@Description("Test cases to verify signup error message for all blank feild")
	@Epic("Ep-0002")
	@Feature("Application Sign-up")
	@Story("To verify user get error when he enetered all blank feild ")
	@Step("Verify error msg for all blank feild ")
	@Severity(SeverityLevel.MINOR)
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
	@Description("Test cases to verify user is not able to signup with blank first name")
	@Epic("Ep-0002")
	@Feature("Application Sign-up")
	@Story("To verify user is not able to signup with blank first name")
	@Step(" verify user is not able to signup with blank first name")
	@Severity(SeverityLevel.MINOR)
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
	@Description("Test cases to verify user is not able to signup with blank mobile number")
	@Epic("Ep-0002")
	@Feature("Application Sign-up")
	@Story("To verify user is not able to signup with blank mobile number")
	@Step("Verify user is not able to signup with blank mobile number")
	@Severity(SeverityLevel.MINOR)
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
	@Description("Test cases to verify user is not able to signup with blank password")
	@Epic("Ep-0002")
	@Feature("Application Sign-up")
	@Story("To verify user is not able to signup with blank password")
	@Step("Verify user is not able to signup with blank password")
	@Severity(SeverityLevel.MINOR)
	@Test(priority=12,retryAnalyzer = RetryExecution.class,enabled=false,description="Test cases to verify user is not able to signup with blank password ")
	public void Testcase12() throws Exception
	{
		Login_pom pg2=PageFactory.initElements(driver,Login_pom.class);

		pg2.button_click();
		Signup_Pom ht=PageFactory.initElements(driver,Signup_Pom.class);
		ht.Creat_submit();
		ht.Enter_Firstname("Test");
		ht.Mobile_enter("9000002225");
		ht.Enter_Pasword("  ");
		ht.Signup_submit();
		ht.MarkInvalidateChk();

	}
	@Description("Test cases to verify user is not able to signup with blank password & mobile no")
	@Epic("Ep-0002")
	@Feature("Application Sign-up")
	@Story("To verify user is not able to signup with blank password & mobile no")
	@Step("Verify user is not able to signup with blank password")
	@Severity(SeverityLevel.MINOR)
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
	@Description("Test cases to verify user is not able to signup with blank firstname & mobile no")
	@Epic("Ep-0002")
	@Feature("Application Sign-up")
	@Story("To verify user is not able to signup with blank firstname & mobile no")
	@Step("Verify user is not able to signup with blank firstname & mobile no")
	@Severity(SeverityLevel.MINOR)
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
	@Description("Test cases to verify user is not able to signup with blank firstname & password")
	@Epic("Ep-0002")
	@Feature("Application Sign-up")
	@Story("To verify user is not able to signup with blank firstname & password")
	@Step("Verify user is not able to signup with blank firstname & password")
	@Severity(SeverityLevel.MINOR)
	@Test(priority=15,retryAnalyzer = RetryExecution.class,enabled=false,description="Test cases to verify user is not able to signup with blank firstname & password ")// required lot of time to verify 358 link hence 
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
}
