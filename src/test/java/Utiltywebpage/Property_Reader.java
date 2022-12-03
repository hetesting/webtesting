package Utiltywebpage;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class Property_Reader
{
	Properties ps;
public Property_Reader()   //Constructor to initialize the file and property class
{
	File src=new File("E:/Project Work/eclipse-workspace/Dukan_Web/Configuration/Read.properties");
	try 
	{
		FileInputStream read=new FileInputStream(src);
	    ps=new Properties();
		ps.load(read);
	} 
	catch (Exception e) 
	{
		
		System.out.println("Exception is"+e.getMessage());
	}
}

public String url()
{
	String url=ps.getProperty("base_url");
	return url;
	
}
public String broweser_type()
{
	String browser=ps.getProperty("browser_type");
	return browser;
	
}
}
