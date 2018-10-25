				================ PROPERTIES FILE ================

What is the topic? What is about?

.properties
centralizing the data

url = http://secure.smartbearsoftware.com/
username = Tester
password = test
......
------------------------------------
Why am I going to use? In situation?

-avoid the hard coded
-store data in one place
-data hiding
------------------------------------
How am I implement it?


Create an utility class to read a properties 
	file and get the value by passing key.
____________________________________

public class ReadProperties {

	private static Properties pr;
	static {

		String path = "/Users/oleksandrostapchuk/eclipse-workspace/TestNG/src/test/java/Aibek_propertiesFIle/Configuration.properties";

		try {

			FileInputStream file = new FileInputStream(path);
			pr = new Properties();
			pr.load(file);
			file.close();

		} catch (Exception e) {

			System.out.println("File is not found!!!");
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return pr.getProperty(key);
	}

}















