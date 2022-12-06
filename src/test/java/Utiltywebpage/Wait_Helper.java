package Utiltywebpage;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Testcasewebpage.Base_Support;

public class Wait_Helper extends Base_Support
{
//	A)First Method in wait class------"Implicit wait"
public void implicitwait(int time) 
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
}

//B-1)Second Method in wait class------"Explicit Wait"--->Visibity of particular webelement
public static WebElement explicitwaittill_visibility(int time,WebElement target)
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
	 wait.until(ExpectedConditions.visibilityOf(target));
	 return target;
}


//2)Second Method in wait class------"Explicit Wait"--->Visibity of particular webelement to be clickabel
public void explicitwait_clickable(int time,WebElement target)
{
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
	wait.until(ExpectedConditions.elementToBeClickable(target));
}
//C-1)Third Method in wait class--------"Fluwent wait
public void fluwent_Wait(int wait_time,int Rep_Time)
{
	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofMillis(wait_time))
			.pollingEvery(Duration.ofMillis(Rep_Time))
			.ignoring(NoSuchElementException.class);
	
}
// D)Page loadout wait
public void page_loadout(int time)
{
	driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(time));
}
// E)Script Loadout wait
public void ScriptLoadOut(int time)
{
	driver.manage().timeouts().scriptTimeout(Duration.ofMillis(time));
}
}
