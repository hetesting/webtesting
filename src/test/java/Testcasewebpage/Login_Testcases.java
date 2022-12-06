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

public class Login_Testcases extends Base_Support
{
//	
	@Description("Test cases to verify user can login sucessfully")
	@Epic("Ep-0001")
	@Feature("Application Login")
	@Story("To verify user can login to application")
	@Step("Verify fb link Navigation")
	@Severity(SeverityLevel.MINOR)
	@Test(enabled=true,description="Test cases to verify login page ",
	dataProvider="data-provider",dataProviderClass=Data.class,
	retryAnalyzer = RetryExecution.class,groups= {"Smoke_testing"})
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
}
