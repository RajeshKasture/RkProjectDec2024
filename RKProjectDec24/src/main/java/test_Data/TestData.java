package test_Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestData {
	
	public String getdataFromProertyFile(String key) throws IOException { 
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Rajesh kasture\\eclipse-workspace\\RKProjectDec24\\src\\main\\java\\test_Data\\TestData");
		p.load(fis);	
		return p.getProperty(key);
	}
}
