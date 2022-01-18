package com.mindtree.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {
	
	public Properties properties;
	String filePath = "config.properties";
	
	public ConfigReader() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	public Properties getProperties() {
		return properties;
	}
	

}
