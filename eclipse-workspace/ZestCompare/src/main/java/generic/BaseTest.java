package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



abstract public class BaseTest implements IAutoConstant {
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	public WebDriver driver;
	/**
	 *  Opening the Browser application
	 * @throws IOException
	 */
	@BeforeClass
	public void OpenApplication()  throws IOException
	{
		String BROWSERNAME =FileLib.getCommonDatafromProperties("browser");  
		//String BROWSER = browser;
		System.out.println("-----Launch Browser------");
		if(BROWSERNAME.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BROWSERNAME.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	/**
	 * Navigating to desired URL page
	 * @throws IOException
	 */
	
	@BeforeMethod
	public void configBM( ) throws IOException 
	{
		String URL = FileLib.getCommonDatafromProperties("url");
		driver.get(URL);
	}
	
	/**
	 * Closing the Browser 
	 */
	@AfterClass
	public void configAC()
	{
		System.out.println("Close Browser...");
		driver.close();
	}

	

}
