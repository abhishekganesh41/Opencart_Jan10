package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	// Elements
			@FindBy(name = "firstname")
			WebElement txtFirstname;

			@FindBy(name = "lastname")
			WebElement txtLasttname;

			@FindBy(name = "email")
			WebElement txtEmail;
			
			@FindBy(name="telephone")
			WebElement   txtphone;

			@FindBy(name = "password")
			WebElement txtPassword;
			
			@FindBy(name="confirm")
			WebElement txtcnfPassword;
			
			@FindBy(name="agree")
			WebElement chkdPolicy;

			@FindBy(xpath= "//input[@value='Continue']")
			WebElement btnContinue;

			@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
			WebElement msgConfirmation;
	public void SetFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
		
	}
	public void SetLastName(String lname)
	{
		txtLasttname.sendKeys(lname);
		
	}
	public void SetEmail(String email)
	{
		txtEmail.sendKeys(email);
		
	}
	public void SetTelephone(String telephone)
	{
		txtphone.sendKeys(telephone);
	}
	
	public void SetPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		
	}
	public void SetCnfPassword(String confirmPassword)
	{
		txtcnfPassword.sendKeys(confirmPassword);
	}
	
	public void SetPrivacyPolicy()
	{
		chkdPolicy.click();
		
	}
	public void ClickContinue()
	{
		btnContinue.click();
		
	}
	
	
	public String getconfirmationmsg()
	{try
	{
		return (msgConfirmation.getText());
	}catch(Exception e)
	{
		return (e.getMessage());
	}
	
	
	
	}
	
	
	
	
}
