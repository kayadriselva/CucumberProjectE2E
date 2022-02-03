package org.qa.amazon.seleniumutility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qa.amazon.base.Browserfactory;

public class UtilityFile extends Browserfactory {
	
	public static void waittillelementvisible(WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void waittillelementclickable(WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static void entertext(WebElement ele, String text)
	{
		waittillelementvisible(ele);
		ele.clear();
		ele.sendKeys(text);
	}
	public static void clickele(WebElement ele)
	{
		waittillelementclickable(ele);
		ele.click();
	}
	
	public static void gettext(WebElement ele)
	{
		waittillelementvisible(ele);
	    ele.getText();
	}
	
	public static void movetoElement(WebElement ele)
	{
		waittillelementvisible(ele);
		Actions a= new Actions(driver);
		a.moveToElement(ele).build().perform();
	}
}