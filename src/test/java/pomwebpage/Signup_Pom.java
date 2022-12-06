package pomwebpage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utiltywebpage.Wait_Helper;

public class Signup_Pom 
{
	WebDriver driver;
	public Signup_Pom(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(id="createAccountSubmit")
	WebElement Create_Account;

	@FindBy(id="ap_customer_name")
	WebElement First_name;

	@FindBy(xpath="//div[contains(text(),'Enter your name')]")
	WebElement First_name_Error;


	@FindBy(id="ap_phone_number")
	WebElement Mobile_no;

	@FindBy(xpath="//div[@id='auth-phoneNumber-missing-alert']//div[@class='a-alert-content'][normalize-space()='Enter your mobile number']")
	WebElement Mobile_no_Error;


	@FindBy(xpath="//a[@id='auth-country-picker_92']")
	WebElement Countrycode;

	@FindBy(id="ap_email")
	WebElement Email_id;

	@FindBy(id="ap_password")
	WebElement Password;

	@FindBy(xpath="//div[contains(text(),' Enter your password')]")
	WebElement Password_Error;

	@FindBy(id="continue")
	WebElement Finalsubmission;

	//h1[@class='a-spacing-small moa_desktop_signup']
	
	@FindBy(xpath="//h1[@class='a-spacing-small moa_desktop_signup']")
	WebElement Chk_mark;
	public void Creat_submit()
	{
		Wait_Helper.explicitwaittill_visibility(20,Create_Account);
		Create_Account.click();

	}
	public void Enter_Firstname(String name)
	{
		Wait_Helper.explicitwaittill_visibility(20,First_name);
		First_name.sendKeys(name);
	}
	
	public void Signup_submit()
	{
		Wait_Helper.explicitwaittill_visibility(20,Finalsubmission);
		Finalsubmission.click();
	}
	
	public void phoneErrorcheck()
	{
		Wait_Helper.explicitwaittill_visibility(20,First_name_Error);
		String actual_text=First_name_Error.getText();
		String desired_text="Enter your name";
		if(actual_text.equals(desired_text))
		{
			System.out.println("Error message for blank name  properly printed");
		}
		else
		{
			System.out.println("Incorrect Error message for blank name printed");
		}

	}
	
	public void Mobile_enter(String m)
	{
		Wait_Helper.explicitwaittill_visibility(20,Mobile_no);
		Mobile_no.sendKeys(m);
	}
	

	public void phoneNoErrorcheck()
	{
		Wait_Helper.explicitwaittill_visibility(20,Mobile_no_Error);
		String actual_text= Mobile_no_Error.getText();
		String desired_text="Enter your mobile number";
		if(actual_text.equals(desired_text))
		{
			System.out.println("Error message for blank mobile properly printed ");
		}
		else
		{
			System.out.println("Error message for blank mobile not properly printed");
		}

	}
	public void Enter_Pasword(String m)
	{
		Wait_Helper.explicitwaittill_visibility(20,Password);
		Password.sendKeys(m);
	}
	public void paswordErrorcheck()
	{
		Wait_Helper.explicitwaittill_visibility(20,Password_Error);
		String actual_text=Password_Error.getText();
		String desired_text="Enter your password";
		if(actual_text.equals(desired_text))
		{
			System.out.println("Error message for blank password  properly printed");
		}
		else
		{
			System.out.println("Incorrect Error message for blank password printed");
		}

	}
	public void MarkInvalidateChk() 
	{
		Wait_Helper.explicitwaittill_visibility(20,Chk_mark);
		String mark=Chk_mark.getText();
		Assert.assertEquals("Still in signup-page", "Create Account", mark);
		System.out.println("Not able to sign-up with blank first_name");
	}

}
