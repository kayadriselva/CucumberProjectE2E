package org.qa.amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyinitialization {
	public Properties prop;

	public Properties property_init() {

		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(
					"C:\\Users\\DELL\\cucumber_project_1\\AmazonCucumber\\src\\test\\resources\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop;
	}

}