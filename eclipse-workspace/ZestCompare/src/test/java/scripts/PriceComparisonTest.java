package scripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FileLib;
import generic.WebDriverUtils;
import pages.AmazonHomePage;
import pages.AmazonProductListPage;
import pages.FlipkartHomePage;
import pages.FlipkartProductListPage;
/**
 * 
 * @author David Bala
 *
 */
public class PriceComparisonTest extends BaseTest
{
	/**
	 * 
	 * @throws IOException
	 */
	@Test
	public void priceComparisonTest() throws IOException
	{ 
		/* Step 1 : Navigating to Amazon.in */
		AmazonHomePage ahp=new AmazonHomePage(driver);
		
		/* Step 2 : Providing the product to be searched in amazon */
		
		AmazonProductListPage aplp = ahp.searchForProduct(FileLib.getCommonDatafromProperties("product"));
		
		/* Step 3 : Fetching the Price of the Product from Amazon */
		String poap =aplp.priceOfProduct();
		
		/* Printing the Price of the Product in FlipKart in console as well as in the TestNg report */
		
		Reporter.log("Price of Product in Amazon :" +poap,true);
		
		/* Step 4 : Navigating to FlipKart.com */
		
		driver.get(FileLib.getCommonDatafromProperties("url2"));
		
		/* Step 5 : Navigate to FilpKart Homepage */
		
		FlipkartHomePage fhp=new FlipkartHomePage(driver);

		/* Step 6 : Providing the product to be searched in amazon */
		
		FlipkartProductListPage fplp=fhp.searchForProduct(FileLib.getCommonDatafromProperties("product"));
		
		/* Step 7 : Fetching the Price of the Product from Amazon */
		String pofp=fplp.priceOfProduct();
		
		/* Printing the Price of the Product in FlipKart in console as well as in the TestNg report */
		Reporter.log("Price of Product in FlipKart :" +pofp,true);
		
		/*Step 8 : Comparing the Price of the Products between Amazon and FlipKart */
		
		if(WebDriverUtils.priceofProduct(poap)>WebDriverUtils.priceofProduct(pofp))
		{
			Reporter.log("FlipKart is Less than Amazon ",true);
		}
		else
		{
			Reporter.log("Amazon is Lesser than FlipKart",true);
		}
		
	}
}
