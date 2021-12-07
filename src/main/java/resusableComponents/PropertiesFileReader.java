package resusableComponents;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {
	
	public static String getKeyValue(String keyName) throws Throwable {
		Properties pf = new Properties();
		pf.load(new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/resources/config.properties")));
		return pf.getProperty(keyName);
	}
	
}
