package pomwebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utiltywebpage.Wait_Helper;

public class Login_pom
{
	WebDriver driver;
	public Login_pom(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement Sign_Navigation;
	
	@FindBy(id="ap_email")
	WebElement Mobile;
	
	@FindBy(id="continue")
	WebElement Continue;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement Signin;
	

	
	@FindBy(xpath="//span[normalize-space()='Sign Out']")
	WebElement Signout;
	
	public void button_click()
	{
		Sign_Navigation.click();
	}
	public void Enter_email(String email)
	{
		Mobile.sendKeys(email);
	}
	
	public void Continue()
	{
		Continue.click();
	}
	
	public void Enter_Pasword(String Passwordrem)
	{
		Password.sendKeys(Passwordrem);
	}
	public void sign_in()
	{
		Signin.click();
	}
	public void sign_out() throws Exception
	{
		Wait_Helper mn=new Wait_Helper();
		Actions ac=new Actions(driver);
		ac.moveToElement(Sign_Navigation);
		mn.implicitwait(60);
		Thread.sleep(5000);
		ac.moveToElement(Signout).click();
	
	//	mn.explicitwait_visibilty(20, Signout);
	//	Signout.click();	
		Thread.sleep(50000);
	}
	
}
