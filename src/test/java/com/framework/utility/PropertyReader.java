package com.framework.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 String defaultConfigFile = "Config.properties";
		 
		 Properties prop = new Properties();
		 
		 FileReader  r = new FileReader (defaultConfigFile);
		 
		 prop.load(r);
		 
		 System.out.println(prop.getProperty("server"));
	}

}
