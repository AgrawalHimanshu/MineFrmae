package com.framework.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class App {
	public static void main(String[] args) {
		App app = new App();
		app.printThemAll();
	}

	private void printThemAll() {

		Properties prop = new Properties();
		InputStream input = null;

		try {

			String filename = "Config.properties";
			input = new FileInputStream(filename);
			//input = App.class.getClassLoader().getResourceAsStream(filename);

			prop.load(input);

			Enumeration<?> e = prop.propertyNames();
			
			System.out.println("After Emuration");
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				System.out.println("Key : " + key + ", Value : " + value);
				System.out.println("In While Loop");
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
