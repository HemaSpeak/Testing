package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("weddriver.chrome.driver", "C:\\Users\\hemas\\Downloads\\edgedriver_win64");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
	WebElement drop =driver.findElement(By.xpath("//select[@id='first']"));
	Select a = new Select(drop);
	boolean multiple=a.isMultiple();
	System.out.println(multiple);
	a.selectByIndex(2);
	Thread.sleep(2000);
	a.selectByValue("Apple");
	Thread.sleep(2000);
	a.selectByVisibleText("Yahoo");
	List<WebElement> option = a.getOptions();
	for(int i =option.size()-1;i>=0;i--)
	{
		WebElement values=option.get(i);
	String text=values.getText();
	System.out.println(text);
	}
	
	/* WebElement down =driver.findElement(By.xpath("//select[@id=\"second\"]"));
	Select d = new Select(down);
	d.selectByIndex(0);
	d.selectByIndex(1);
	d.selectByIndex(2);
	d.selectByIndex(3);
	d.deselectAll();*/
	
	

	}

}
