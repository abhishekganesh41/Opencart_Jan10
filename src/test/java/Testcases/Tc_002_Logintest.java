package Testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class Tc_002_Logintest  extends BaseClass
{
	@Test(groups= {"Sanity","Master"})
   public void  test_Login()
   {
		logger.info("Starting Tc_002_Logintest");
	  try
	  {
	   
	    
	   HomePage hp=new HomePage(driver);
	   hp.clickMyAccount();
	   
	   hp.clickLogin();
	   
	   LoginPage lp=new LoginPage(driver);
	   logger.info("providing login details");
	   lp.setEmail(rb.getString("email"));// valid email  config.properties
	   lp.setPassword(rb.getString("password"));
	   lp.clickLogin();
	   
	   
	   MyAccountPage macc= new MyAccountPage(driver);
	 boolean  targetpage= macc.isMyAccountPageExists();
	 Assert.assertEquals(targetpage, true);
	  }
	  catch(Exception e)
	  {
		  Assert.fail();
	  }
	 
	  logger.info("finished Tc_002_Logintest");
	  
	   
	   
	   
  }
}
