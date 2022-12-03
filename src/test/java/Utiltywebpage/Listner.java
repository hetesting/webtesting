package Utiltywebpage;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Testcasewebpage.Base_Support;

public class Listner<ExtentSparkReporter>  extends Base_Support implements ITestListener
{
	ExtentHtmlReporter html;
	ExtentReports report;
	ExtentTest test;
	//Report Configuration
	public void config_report()
	{
		html=new ExtentHtmlReporter("Extentreporttesting.html");
	//	 html=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myfirstreport.html");
	//	ExtentSparkReporter htmlreporter =new ExtentSparkReporter("Extentreporttesting.html");
		
		report=new ExtentReports ();
		report.attachReporter(html);
		
		// adding system information
		
		report.setSystemInfo("Machine:", "Test_pc");
		report.setSystemInfo("os:", "window10");
		report.setSystemInfo("broweser:", "chrome");
		report.setSystemInfo("Username", "Hemant");
		
		
		// configuration to change look and feel of report
		html.config().setDocumentTitle("Dukan Web-testing extent report");
		html.config().setReportName("This is first report name");
		html.config().setTheme(Theme.DARK);
	}
	public void onStart(ITestContext result)
	{
		config_report();
		System.out.println("Test started sucesfully");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test passed sucesfully");
	}
	public void onTestfailure(ITestResult result)
	{
		Take_ScreenShot .Screenshot(driver,result.getName());
		test=report.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("Name of fail testcase is:"+result.getName(), ExtentColor.RED));
	}
	public void onTestSkipped(ITestResult result)
	{
		test=report.createTest(result.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel("Name of fail testcase is:"+result.getName(), ExtentColor.BLACK));
	}
	public void onStart(ITestResult result)
	{
		
	}
	public void onfinish(ITestResult result)
	{
		System.out.println("Test finished sucesfully");
		report.flush();
	
	}
}

