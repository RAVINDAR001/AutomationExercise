package GenericFileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtilty {
	
	
	public String ToReaddataFromProperty(String Key) throws IOException {
		
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");	
			Properties prop=new Properties();
			prop.load(fis);
			
		String value = prop.getProperty(Key);
			return value;
			
			
		}

}
