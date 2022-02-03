package org.qa.amazon.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.qa.amazon.base.Browserfactory;
import org.qa.amazon.seleniumutility.UtilityFile;

public class LoginPage extends Browserfactory {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Hello, Sign in']")
	WebElement signin;
	
	@FindBy(xpath="//a[@id='icp-nav-flyout']")
	WebElement languageselection;
	
	@FindBy(xpath="(//i[@class='icp-radio icp-radio-active'])[1]")
	WebElement radiobuttonenglish;
	
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement signinbutton;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	public void mousehoversignin()
	{
		UtilityFile.movetoElement(signin);
	}
	
	public void mousehoverlanguage()
	{
		UtilityFile.movetoElement(languageselection);
	}
	
	public boolean englishlanguageselected()
	{
		return radiobuttonenglish.isSelected();
	}
	
	public String returntitle()
	{
		return driver.getTitle();
	}
	
	public boolean siginbuttondisplayed()
	{
		return signinbutton.isDisplayed();
	}
	
	public void signinbuttonclick()
	{
		//signinbutton.click();
		UtilityFile.clickele(signinbutton);	
	}
	
	public void enteremail(String emailaddress)
	{
		//email.sendKeys(emailaddress);
		UtilityFile.entertext(email, emailaddress);
	}
	
	public void continuebuttonclick()
	{
		//continuebutton.click();
		UtilityFile.clickele(continuebutton);
	}

	
}
