package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebDriverUtils;

public class TripAdvisorHotelReviewPage 
{

	public WebDriver driver;
	
	@FindBy(id ="bubble_rating")
	private WebElement ratingBtn;
	
	@FindBy(id ="qid12_bubbles")
	private WebElement serviceratingBtn;
	
	@FindBy(id ="qid190_bubbles")
	private WebElement sleepQualityRatingBtn;
	
	@FindBy(id ="qid11_bubbles")
	private WebElement roomsRatingBtn;
	
	@FindBy(id="qid13_bubbles")
	private WebElement valueRatingBtn;
	
	@FindBy(id="qid14_bubbles")
	private WebElement cleanlinessRatingBtn;
	
	@FindBy(id="qid47_bubbles")
	private WebElement locationRatingBtn;
	
	@FindBy(xpath="//div[.='Hotel Ratings']")
	private WebElement hotelRatingsText;
	
	@FindBy(xpath="//div[.='Service']")
	private WebElement serviceRatingsText;
	
	@FindBy(xpath="//div[.='Rooms']")
	private WebElement roomsRatingsText;
	
	@FindBy(xpath="//div[.='Value']")
	private WebElement valueRatingsText;
	
	@FindBy(xpath="//div[.='Cleanliness']")
	private WebElement cleanlinessRatingsText;
	
	@FindBy(xpath="//div[.='Sleep Quality']")
	private WebElement sleepQualityRatingsText;
	
	@FindBy(xpath="//div[.='Location']")
	private WebElement locationRatingsText;
		
	@FindBy(xpath="//div[@class ='questionHeader labelHeader hide_in_overlay']")
	private WebElement moveUntiltext;
	
	@FindBy(id="ReviewTitle")
	private WebElement titleOfYourReviewTextBox;
	
	@FindBy(id="ReviewText")
	private WebElement yourReviewTextBox;
	
	@FindBy(id="noFraud")
	private WebElement submitCheckBox;
	
	@FindBy(xpath="//div[.='Submit your review']")
	private WebElement movetillSubmitText;
	/*--------------------------------------------------------------------------*/
	/*--------------------------------------------------------------------------*/
	public TripAdvisorHotelReviewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	/*--------------------------------------------------------------------------*/
	public void summaryOfVisit(String title)
	{
		titleOfYourReviewTextBox.sendKeys(title);
	}
	/*--------------------------------------------------------------------------*/
	public void userReview(String review)
	{
		yourReviewTextBox.sendKeys(review);
	}
	/*--------------------------------------------------------------------------*/
	public void clickOnSubmitReviewCheckBox() throws InterruptedException
	{
		WebDriverUtils.waitForElementToLoad(driver);
		WebDriverUtils.scrollWindow(driver, movetillSubmitText);
		WebDriverUtils.waitAndClick(driver, submitCheckBox);
	}
	/*--------------------------------------------------------------------------*/
	public void userRating()
	{
		WebDriverUtils.waitForElementToLoad(driver);
		Actions a=new Actions(driver);
		for(int i=10;i<=50;)
		{
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if(i<50)
			{
				a.moveToElement(ratingBtn, i,1).perform();
				i=i+10;
			}
			else if(i<=50)
			{
				a.moveToElement(ratingBtn, i,1).click().perform();
				break;
			}
			
		}
	}
	
	/*--------------------------------------------------------------------------*/
	
	public void hotelRatings()
	{
		WebDriverUtils.waitForElementToLoad(driver);
		if(hotelRatingsText.isDisplayed()) 
		{
		WebDriverUtils.scrollWindow(driver,moveUntiltext);
		if(serviceRatingsText.isDisplayed())
		{ 
			serviceRating();
		}
		if(sleepQualityRatingsText.isDisplayed())
		{
			sleepQualityRating();
		}
		if(valueRatingsText.isDisplayed())
		{
			valueRating();
		}
		if(roomsRatingsText.isDisplayed())
		{
		    roomQualityRating();	
		}
		if(locationRatingsText.isDisplayed())
		{
			locationQualityRating();
		}
		if(cleanlinessRatingsText.isDisplayed())
		{
			cleanlinessQualityRating();
		}
	}
		
	}
	
	/*--------------------------------------------------------------------------*/
	
	public void serviceRating()
	{
		WebDriverUtils.waitForElementToLoad(driver);
		Actions a=new Actions(driver);
		for(int i=10;i<=50;)
		{
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if(i<50)
			{
				a.moveToElement(serviceratingBtn, i,1).perform();
				i=i+10;
			}
			else if(i<=50)
			{
				a.moveToElement(serviceratingBtn, i,1).click().perform();
				break;
			}
			
		}
	}
	
	/*--------------------------------------------------------------------------*/
	
	public void sleepQualityRating()
	{
		WebDriverUtils.waitForElementToLoad(driver);
		Actions a=new Actions(driver);
		for(int i=10;i<=50;)
		{
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if(i<50)
			{
				a.moveToElement(sleepQualityRatingBtn, i,1).perform();
				i=i+10;
			}
			else if(i<=50)
			{
				a.moveToElement(sleepQualityRatingBtn, i,1).click().perform();
				break;
			}
			
		}
	}
	
	/*--------------------------------------------------------------------------*/
	
	public void valueRating()
	{
		WebDriverUtils.waitForElementToLoad(driver);
		Actions a=new Actions(driver);
		for(int i=10;i<=50;)
		{
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if(i<50)
			{
				a.moveToElement(valueRatingBtn, i,1).perform();
				i=i+10;
			}
			else if(i<=50)
			{
				a.moveToElement(valueRatingBtn, i,1).click().perform();
				break;
			}
			
		}
	}
	
	/*--------------------------------------------------------------------------*/
	public void roomQualityRating()
	{
		WebDriverUtils.waitForElementToLoad(driver);
		Actions a=new Actions(driver);
		for(int i=10;i<=50;)
		{
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if(i<50)
			{
				a.moveToElement(roomsRatingBtn, i,1).perform();
				i=i+10;
			}
			else if(i<=50)
			{
				a.moveToElement(roomsRatingBtn, i,1).click().perform();
				break;
			}
			
		}
	}
	/*--------------------------------------------------------------------------*/
	public void cleanlinessQualityRating()
	{
		WebDriverUtils.waitForElementToLoad(driver);
		Actions a=new Actions(driver);
		for(int i=10;i<=50;)
		{
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if(i<50)
			{
				a.moveToElement(cleanlinessRatingBtn, i,1).perform();
				i=i+10;
			}
			else if(i<=50)
			{
				a.moveToElement(cleanlinessRatingBtn, i,1).click().perform();
				break;
			}
			
		}
	}
	/*--------------------------------------------------------------------------*/
	public void locationQualityRating()
	{
		WebDriverUtils.waitForElementToLoad(driver);
		Actions a=new Actions(driver);
		for(int i=10;i<=50;)
		{
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if(i<50)
			{
				a.moveToElement(locationRatingBtn, i,1).perform();
				i=i+10;
			}
			else if(i<=50)
			{
				a.moveToElement(locationRatingBtn, i,1).click().perform();
				break;
			}
			
		}
	}
	
}
