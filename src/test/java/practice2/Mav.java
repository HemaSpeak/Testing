package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Mav {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hemas\\Downloads");
		//WebDriverManager.edgedriver().setup();
	 WebDriver driver = new EdgeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.navigate().to("https://www.facebook.com/");
	 driver.navigate().back();
	 Thread.sleep(2000);
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 String title = driver.getTitle();
	 System.out.println(title);
	 String cu=driver.getCurrentUrl();
	 System.out.println(cu);
	 driver.navigate().to("https://www.facebook.com/");
	 driver.close();
}
}
