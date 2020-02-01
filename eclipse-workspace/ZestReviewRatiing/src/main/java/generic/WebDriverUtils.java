package generic;


import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author David Bala
 *
 */


public class WebDriverUtils extends BaseTest {

	/**
	 * 
	 * @param driver
	 */
	public static void waitForElementToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public static void waitForElementToClick(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public static void waitForElementTobeVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 * @throws InterruptedException
	 */
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
	/**
	 * 
	 * @param element
	 * @param driver
	 */
	public static void moveMouseOnElement(WebElement element , WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();	
	}
	/**
	 * 
	 */
	public static String parentWin_id ;
	static String childWin_id ;
	/**
	 * 
	 * @param driver
	 */
	public static void switchToChildWindow(WebDriver driver)
	{
		Set<String> chwnd = driver.getWindowHandles();
		Iterator<String> i = chwnd.iterator();
		parentWin_id=i.next();
		childWin_id= i.next();
		driver.switchTo().window(childWin_id);
	}
	/**
	 * 
	 * @param driver
	 */
	public static void switchToParentWindow(WebDriver driver)
	{
		driver.switchTo().window(parentWin_id);
	}
	/**
	 * 	
	 * @param driver
	 * @param element
	 */
	public static void scrollWindow(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Point xaxis = element.getLocation();
		int yaxis=xaxis.getY();
		jse.executeScript("window.scrollTo(0,"+ yaxis + ")");
	}
	
}
