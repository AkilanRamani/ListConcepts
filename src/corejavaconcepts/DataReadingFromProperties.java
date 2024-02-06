package corejavaconcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReadingFromProperties {

	public static void main(String[] args) throws IOException {
		String fileInputStream = "C:\\Users\\akilan-18633\\eclipse-workspace\\ListCollections\\data\\data.properties";

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(fileInputStream);
		prop.load(fis);
		String a = "true";
		System.out.println(a);
	    String key =prop.getProperty("headless");
		System.out.println(key);
		boolean flag = Boolean.parseBoolean(key);
		System.out.println(flag);
		boolean headlessBrowser =  prop.getProperty("headless") != null ? Boolean.parseBoolean(prop.getProperty("headless")) : false;
		System.out.println(headlessBrowser);
	}

}
