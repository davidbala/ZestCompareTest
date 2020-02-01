package pages;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.FileLib;
import generic.WebDriverUtils;

/**
 * 
 * @author David Bala
 *
 */
public class AmazonHomePage {
	public WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	/**
	 * 
	 * @param this parameter driver initiates the elements present in the AmazonHomePage 
	 */
	public AmazonHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * 
	 * @param product to be searched in Amazon
	 * @return
	 */
	public AmazonProductListPage searchForProduct(String product)
	{
		searchBox.sendKeys(product,Keys.ENTER);
		return new AmazonProductListPage(driver);
		
	}
	
	
}
