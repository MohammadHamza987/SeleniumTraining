package Propertiesfiledemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfigfile {
	// now to read property file in testcasee.java we need one class in java called
	// as Properties
	Properties properties;
	String path = "C:\\Users\\mohom\\Eclipse new\\Test1byPrachi\\src\\test\\java\\Propertiesfiledemo\\Config.properties";

	// Constructor is used now to link classes
	public Readconfigfile() {
		properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);// to read file
			try {
				properties.load(fis);// to load file
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// now to read config.properties file
	public String getURl() {
		String url = properties.getProperty("url");// it will fetch the url that is stored on config.properties
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in config file");
	}

	public String getUsername() {
		String username = properties.getProperty("username");// it will fetch the username that is stored on
																// config.properties
		if (username != null)
			return username;
		else
			throw new RuntimeException("username not specified in config file");
	}

	public String getPassword() {
		String password = properties.getProperty("password");// it will fetch the password that is stored on
																// config.properties
		if (password != null)
			return password;
		else
			throw new RuntimeException("password not specified in config file");
	}

}
