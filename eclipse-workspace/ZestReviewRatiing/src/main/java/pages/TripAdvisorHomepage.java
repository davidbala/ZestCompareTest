package pages;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import generic.WebDriverUtils;

/**
 * 
 * @author David Bala
 *
 */
public class TripAdvisorHomepage {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchBox1;
				
	@FindBy(xpath="//span[text()='Search']")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@placeholder='Search Tripadvisor']")
	private WebElement innerSearchBox;
	/*--------------------------------------------------------------------------*/
	public TripAdvisorHomepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*--------------------------------------------------------------------------*/
	public TripAdvisorHotelListPage searchForHotels(String hName)
	{
		WebDriverUtils.waitForElementToLoad(driver);
		try{
			searchBox.click();
			innerSearchBox.sendKeys(hName,Keys.ENTER);
		}
		catch(Exception e)
		{
			searchBox1.sendKeys(hName,Keys.ENTER);
		}		
		return new TripAdvisorHotelListPage(driver);
	}
}
