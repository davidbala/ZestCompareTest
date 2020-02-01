package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebDriverUtils;
/**
 * 
 * @author David Bala
 *
 */
public class FlipkartHomePage {
	
	public WebDriver driver;
	
	@FindBy(name="q" )
	private WebElement searchBox;
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement closeBtn;
	
	/**
	 * 
	 * @param this parameter driver initiates the elements present in the FlipkartHomePage 
	 */
	public FlipkartHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * 
	 * @param product to be searched in Amazon
	 * @return
	 */
	public FlipkartProductListPage searchForProduct(String product)
	{
		WebDriverUtils.waitForElementToLoad(driver);
		closeBtn.click();
		searchBox.sendKeys(product,Keys.ENTER);
		return new FlipkartProductListPage(driver);
	}

}
