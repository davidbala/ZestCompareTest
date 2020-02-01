package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebDriverUtils;

public class TripAdvisorHotelDetailsPage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//div[@class='hotels-community-content-common-ContextualCTA__currentOption--3Wd5D']")
	private WebElement writeReviewBtn;
	
	@FindBy(xpath="//a[.='Most Booked Properties in Madikeri']")
	private WebElement moveUntilText;
	
	/*--------------------------------------------------------------------------*/
	
	public TripAdvisorHotelDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*--------------------------------------------------------------------------*/
	
	public TripAdvisorHotelReviewPage clickOnWriteReviewBtn()
	{
		int c=0;
		WebDriverUtils.switchToChildWindow(driver);
		WebDriverUtils.scrollWindow(driver, moveUntilText);
		writeReviewBtn.click();
		System.out.println(driver.getWindowHandles().size());
		for(String wh:driver.getWindowHandles())
		{
			driver.switchTo().window(wh);
			System.out.println(c++);
			System.out.println(driver.getTitle());
		}
		return new TripAdvisorHotelReviewPage(driver);
	}
}
