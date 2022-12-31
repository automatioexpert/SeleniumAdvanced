package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperation {

	public static Properties prop = new Properties();
	public static FileInputStream fis;

	public static String loadProperties(String key) {

		try {
			fis = new FileInputStream("./src/test/resources/config.properties");
		} catch (FileNotFoundException e) {

		}

		try {
			prop.load(fis);
		} catch (IOException e) {

		}

		return prop.getProperty(key);
	}

}
