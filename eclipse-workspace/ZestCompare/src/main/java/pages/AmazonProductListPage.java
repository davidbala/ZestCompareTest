package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author David Bala
 *
 */
public class AmazonProductListPage {
	
	public WebDriver driver;
		
	@FindBy(xpath="//span[text()='Apple iPhone XR (64GB) - Yellow']/../../../../../../../../../div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span/span[2]/span[2]")
	private WebElement productPrice;
	/**
	 * 
	 * @param this parameter driver initiates the elements present in the AmazonHomePage 
	 */
	public AmazonProductListPage(WebDriver driver)
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
		String pop=productPrice.getText();
		return pop;
	}
}
