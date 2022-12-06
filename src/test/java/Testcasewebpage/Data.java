package Testcasewebpage;

import org.testng.annotations.DataProvider;

public class Data
{

	@DataProvider(name="data-provider")
	public Object [][] dpmethod()
	{
		return new Object[][]
				{
			      {"hemantpatiltech@gmail.com","Rohini@123"}
			  //   {"hemantpatiltech@gmail.com","Rohini@123"},
			  //   {"hemantpatiltech@gmail.com","Rohini@123"},
			   //  {"hemantpatiltech@gmail.com","Rohini@123"}
				};
		
	}
}
