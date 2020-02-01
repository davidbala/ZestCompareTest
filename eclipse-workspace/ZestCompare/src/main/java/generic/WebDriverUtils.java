package generic;

import java.io.File;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverUtils extends BaseTest {	
	
	public static void waitForElementToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void waitForElementToClick(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForElementTobeVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public static void waitAndClick(WebDriver driver ,WebElement element) throws InterruptedException
	{
		int count = 0;
		while (count <=20)
		{
			try {
				element.click();
				break;
			}
			
			catch(Throwable t)
			{
				Thread.sleep(1000);
				count++;
			}
		}
	}
			
	public static long priceofProduct(String price)
	{
		String s="";
		char[] a = price.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(!(a[i]>='0' && a[i]<='9'))
			{
				continue;
			}
			else
			{
				s=s+a[i];
			}
		}
		long num=Long.parseLong(s);
		return num;
		
	}
	
	
	

}
