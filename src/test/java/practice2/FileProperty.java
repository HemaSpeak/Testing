package practice2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileProperty {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\hemas\\eclipse-workspace\\practice\\Testing\\src\\test\\resources\\ile.properties");
		try {
			FileInputStream f1 = new FileInputStream(f);
			Properties pr = new Properties();
			pr.load(f1);
			String url=pr.getProperty("url");
			String user = pr.getProperty("username");
			String pass = pr.getProperty("password");
			String env = pr.getProperty("env");
			System.out.println(url);
			System.out.println(user);
			System.out.println(pass);
			System.out.println(env);
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
