package pomwebpage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
		Create_Account.click();

	}
	public void Enter_Firstname(String name)
	{
		First_name.sendKeys(name);
	}
	
	public void Signup_submit()
	{

		Finalsubmission.click();
	}
	
	public void phoneErrorcheck()
	{
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
		Mobile_no.sendKeys(m);
	}
	

	public void phoneNoErrorcheck()
	{
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
		Password.sendKeys(m);
	}
	public void paswordErrorcheck()
	{
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
		String mark=Chk_mark.getText();
		Assert.assertEquals("Still in signup-page", "Create Account", mark);
		System.out.println("Not able to sign-up with blank first_name");
	}

}
