package Testcasewebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utiltywebpage.Property_Reader;
import Utiltywebpage.Wait_Helper;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Support 
{
	Property_Reader rd=new Property_Reader();
	 public static WebDriver driver = null;
	
	@BeforeMethod
public void setup()
{
		
	String br1=rd.broweser_type();
	if(br1.equalsIgnoreCase("Chrome"))
	{
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    Wait_Helper nj=new Wait_Helper();
	    nj.implicitwait(20);
	}
	else if(br1.equalsIgnoreCase("Firefox"))
	{
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	else if(br1.equalsIgnoreCase("edge"))
	{
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
	else if(br1.equalsIgnoreCase("afaridriver"))
	{
		
		WebDriverManager.safaridriver().setup();
		driver=new SafariDriver();
	}
	
	
	driver.manage().window().maximize();
	
	driver.get(rd.url());
	
}
	
	
	@AfterMethod
public void teardown()
{
	driver.quit();
}
}
