package Testcasewebpage;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Utiltywebpage.Property_Reader;
import Utiltywebpage.Wait_Helper;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Support 
{
	Property_Reader rd=new Property_Reader();
	 public static WebDriver driver = null;
//	 public static RemoteWebDriver driver;
//	 @BeforeClass 
//	 public void Saucelabtesting() throws MalformedURLException
//   {
////		 DesiredCapabilities capability=new DesiredCapabilities();
////		 capability.setBrowserName("chrome");
////		 capability.setPlatform(Platform.XP);
////		 driver=new RemoteWebDriver(new URL("http://192.168.224.25:4444/wd/hub"),capability);
////		 
////		 ChromeOptions options = new ChromeOptions();
////		 options.setPlatformName("Windows 10");
////		 options.setBrowserVersion("100.0");
////		 options.setCapability("idle-timeout", 180);
////
////		 Map<String, Object> sauceOptions = new HashMap<>();
////		 sauceOptions.put("username", System.getenv("SAUCE_USERNAME"));
////		 sauceOptions.put("accessKey", System.getenv("SAUCE_ACCESS_KEY"));
////		 sauceOptions.put("name", "test1");
//		 ChromeOptions browserOptions = new ChromeOptions();
//		 browserOptions.setPlatformName("Windows 11");
//		 browserOptions.setBrowserVersion("latest");
//		 Map<String, Object> sauceOptions = new HashMap<>();
//		 sauceOptions.put("build", "selenium-build-B0OMX");
////		 sauceOptions.setCapability("name", "<your test name>");
//		 browserOptions.setCapability("commandTimeout", 600);
//		 browserOptions.setCapability("sauce:options", sauceOptions);
//
//	//	 options.setCapability("sauce:options", sauceOptions);
//	//	 URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//		 URL url = new URL("https://oauth-hemantpatiltech-e4b6e:42f974f1-d73b-4089-a6fe-1022776aa9e3@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//				 
//				  driver = new RemoteWebDriver(url, browserOptions);
// }
	
	@BeforeMethod
public void setup() throws InterruptedException
{
		
	String br1=rd.broweser_type();
	if(br1.equalsIgnoreCase("Chrome"))
	{
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	  //  Wait_Helper nj=new Wait_Helper();
	 //   nj.implicitwait(20);
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
