package config_Pkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import selenium_Test.googleSearch_With_TestNG;

public class properties_Details {

	static Properties prop = new Properties();
	static String propertyPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set_Properties();
		get_Properties();		

	}

	public static void get_Properties() {
		
		
		try {
		//input stream to read the file
			InputStream input = new FileInputStream(propertyPath + "/src/test/java/config_Pkg/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			//Assigning  the browserName value to be used in the googleSearch_With_TestNG class
			googleSearch_With_TestNG.browserName = browser;
			
			
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void set_Properties() {
		try {
			OutputStream output = new FileOutputStream(propertyPath + "/src/test/java/config_Pkg/config.properties");
			prop.setProperty("result","pass");
			prop.store(output, null);

		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();			
		}
	}
}
