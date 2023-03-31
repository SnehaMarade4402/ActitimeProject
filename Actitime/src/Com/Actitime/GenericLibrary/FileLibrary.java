package Com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This class is generic class which is have non static method to perform data driven testing
 * @author Sneha
 *
 */
public class FileLibrary {
	
	
public String readDataFromProperty(String key) throws IOException {
	FileInputStream fis =new FileInputStream("./Testdata/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}
}
