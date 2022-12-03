package Utiltywebpage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Take_ScreenShot 
{
public static File Screenshot(WebDriver driver,String ScreenshotName)
{
	File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date d=new Date();
	String timstamp=d.toString().replace(":", "_").replace("", "_");
;	File destination=new File("E:/Project Work/eclipse-workspace/Dukan_Web/Screenshot_folder/"+ScreenshotName+"_"+timstamp+".png");
	try {
		FileHandler.copy(screen, destination);
	} 
	catch (IOException e) 
	{
		System.out.println("path is wrong");;
	}
	return destination;
}
}
