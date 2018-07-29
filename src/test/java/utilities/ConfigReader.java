package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties configFile;

	static {

		try {
			configFile = new Properties();
			String path = "\\Users\\Ai\\eclipse-workspace\\SkyWareChicago5\\config.properties";
			FileInputStream input = new FileInputStream(path);

			
			configFile.load(input);

			input.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}


	
}
