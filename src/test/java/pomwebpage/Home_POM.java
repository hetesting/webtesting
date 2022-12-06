package pomwebpage;

import static org.testng.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcasewebpage.Base_Support;
import Utiltywebpage.Wait_Helper;

public class Home_POM extends Base_Support
{
	public WebDriver driver;
	Wait_Helper nv;
	public Home_POM (WebDriver driver)
	{
		this.driver=driver;
	}

	int brokenlistcount=0;

	@FindBy(id="nav-logo-sprites")
	WebElement text;

	@FindBy(tagName="a")
	List <WebElement> link;

	
	@FindBy(xpath="//a[@class='nav-imageHref']")
	WebElement shopping_made_tab;
	
	@FindBy(xpath="//a[normalize-space()='Facebook']")
	WebElement fb_Link;
	
	
	
	@FindBy(xpath="//a[normalize-space()='Twitter']")
	WebElement Twitter_Link;

	@FindBy(xpath="//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft x1120s5i']")
	WebElement fb_link_verify;
	
	
	@FindBy(xpath="//span[normalize-space()='The official Twitter profile of']")
	WebElement Twitter_verify;
	
	@FindBy(xpath="//a[normalize-space()='Instagram']")
	WebElement Inst_link;
	
	@FindBy(xpath="//span[@class='_ab37']")
	WebElement Inst_verify;
	
	public void verifylogo()
	{
		Wait_Helper.explicitwaittill_visibility(20,text);
		String d=text.getText();
		System.out.println(d);
	}

	public void verifyhyperlink() throws Exception
	{
		System.out.println("Total link in list:"+link.size());
		for(WebElement element:link)
		{
			String url=element.getAttribute("href");
			try
			{
				URL urllink=new URL(url);
				HttpURLConnection huc=(HttpURLConnection)urllink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();

				int rescode=huc.getResponseCode();
				if(rescode>=400)
				{
					System.out.println(url + "broken link");
					brokenlistcount++;
				}
			}
			catch(MalformedURLException e) 
			{

			}
			catch(Exception e) 
			{

			}
			System.out.println("Total broken link:"+brokenlistcount);

		}

	}
	public void Verifytitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Amazon.in: Amazon Fresh"))
		{
			System.out.println("Title is right");
		}
		else
		{
			System.out.println("Title is wrong");
		}
	}
	public void Tab_clickable()
	{
		Wait_Helper.explicitwaittill_visibility(20,shopping_made_tab);
		shopping_made_tab.click();
	}
	
	public void horizontal_Swipe() throws Exception
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;   //typecast
		
	//	js.executeScript("window.scrollBy(0,5000)");  /// scroll by pixel....
	//	js.executeScript("argument[0].scrollintoView();",shopping_image);   // scroll by till element is found
//		Thread.sleep(2000);
     	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(document.body.scrollHeight,0)");

     	
	}
	
	public void naviafteFb() 
	{
		Wait_Helper.explicitwaittill_visibility(20,fb_Link);
		fb_Link.click();
		Wait_Helper.explicitwaittill_visibility(20,fb_link_verify);
		String g=fb_link_verify.getText();
		
		String h="See more of Amazon India on Facebook";
		
		assertEquals(g, h);
		
		if (g.equals(h))
		{
			System.out.println("Properly navigated to fb page");
		}
		
	}
	public void naviagate_twitter() 
	{
		Wait_Helper.explicitwaittill_visibility(20,Twitter_Link);
		Twitter_Link.click();
		Wait_Helper.explicitwaittill_visibility(20,Twitter_verify);
		String g=Twitter_verify.getText();
		
		String h="The official Twitter profile of ";
		
		assertEquals(g, h);
		
		if (g.equals(h))
		{
			System.out.println("Properly navigated to twitter page");
		}
		
	}
	public void naviagate_instagram() 
	{
		Wait_Helper.explicitwaittill_visibility(20,Inst_link);
		Inst_link.click();
		
		Wait_Helper.explicitwaittill_visibility(20,Inst_verify);
		String g=Inst_verify.getText();
		
		String h="Log in with Facebook%%%%%%";
		
		assertEquals(g, h);
		
		if (g.equals(h))
		{
			System.out.println("Properly navigated to insta page");
		}
		
	}
}
