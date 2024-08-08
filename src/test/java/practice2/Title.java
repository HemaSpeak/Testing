package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\hemas\\Downloads\\edgedriver_win64");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.flipkart.com");
		String Url= driver.getTitle();
		System.out.println(Url);
		driver.switchTo().newWindow(WindowType.TAB);
		String d=driver.getCurrentUrl();
		System.out.println(d);
		if(Url==d)
		{
			System.out.println("URL matches");
			
		}
		else
		{
			System.out.println("Url mismatches");
		}
		

	}

}
