package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripAdvisorHotelListPage 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//div[@class='location-meta-block'])[1]/div[1]")
	private WebElement selectFirstOption; 

	/*--------------------------------------------------------------------------*/
	
	public TripAdvisorHotelListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	/*--------------------------------------------------------------------------*/
	
	public TripAdvisorHotelDetailsPage clickOnFirstResult()
	{
		selectFirstOption.click();
		return new TripAdvisorHotelDetailsPage(driver);
	}

}
