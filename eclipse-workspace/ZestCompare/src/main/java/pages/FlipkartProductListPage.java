package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author David Bala
 *
 */
public class FlipkartProductListPage {

	public WebDriver driver;
	
	@FindBy(xpath="//div[text()='Apple iPhone XR (Yellow, 64 GB)']")
	private WebElement product;
	
	@FindBy(xpath="//div[@class='_1vC4OE _2rQ-NK']" )
	private WebElement priceField;
	/**
	 * 
	 * @param this parameter driver initiates the elements present in the AmazonHomePage 
	 */
	public FlipkartProductListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	/**
	 * Fetches the price of the product searched and returns the prce of the product
	 * @return
	 */
	public String priceOfProduct()
	{
		String pf=priceField.getText();
		return pf;
	}
	
	
	
}
