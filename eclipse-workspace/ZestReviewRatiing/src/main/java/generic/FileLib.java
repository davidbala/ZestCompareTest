package generic;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class FileLib implements IAutoConstant
{
	
	
	/*fetch data from Property file from dataResource folder */
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String getCommonDatafromProperties(String key) throws IOException
	{
		FileInputStream fisObj = new FileInputStream("./src/main/resources/data/givendata.properties");
		Properties pObj = new Properties();
				   pObj.load(fisObj);
		String value =pObj.getProperty(key);
		return value;
	}
	
	

}
