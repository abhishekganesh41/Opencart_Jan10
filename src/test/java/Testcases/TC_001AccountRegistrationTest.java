package Testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001AccountRegistrationTest extends BaseClass{
	
	@Test(groups= {"Regression","Master"})
	public void test_acoount_Registration() throws InterruptedException
	{
		logger.debug("application logs....");
		logger.info("***Starting TC_001AccountRegistrationTest***" );
		try
		{
		HomePage hp=new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("Clicked on my account link");
		hp.clickRegister();
		logger.info("clicked on register link");
		
		
		RegistrationPage regpage=new RegistrationPage(driver);
		logger.info("providing customer data");
		
		regpage.SetFirstName("Dimmy".toUpperCase());
		regpage.SetLastName("Reddy");
		regpage.SetEmail(randomeString()+("@gmail.com"));
		regpage.SetTelephone("7331103542");
		String password=RandomeAlapNumeric();
		
		regpage.SetPassword(password);
		regpage.SetCnfPassword(password);
		regpage.SetPrivacyPolicy();
	
		regpage.ClickContinue();
		logger.info("Clicked on continue");
		
	
		String confmsg=regpage.getconfirmationmsg();
		logger.info("validation expected message");
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!","Test failed");
		}catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail(); 
		}
		logger.info("***Finished TC_001AccountRegistrationTest***" );
	}
	

}
