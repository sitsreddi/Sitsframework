package customcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import startandstop.StartandStop;

public class ActionDriver extends StartandStop{
	public static void type(By locator, String text)
	{
	driver.findElement(locator).clear();
	driver.findElement(locator).sendKeys(text);	
	}
	public static void click(By locator)
	{
		driver.findElement(locator).click();			
		
	}
	public static void launchurl(String url)
	{
		driver.navigate().to(url);			
		
	}
	public static void select(By locator, String text)
	{
		WebElement dd=driver.findElement(locator);
		  // Select inbuilt class in java webdriver
			Select s= new Select(dd);
			s.selectByVisibleText(text);
		
	}
	
}