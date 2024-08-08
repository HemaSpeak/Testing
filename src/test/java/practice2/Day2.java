package practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\hemas\\Downloads\\edgedriver_win64");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
	WebElement email =	driver.findElement(By.id("email"));
	if (email.isDisplayed())
	{
		email.sendKeys("Hemaspeaksu@gmail.com");
		email.clear();
		email.sendKeys("joinsiva@gmail.com");
	}
	else
	{
		System.out.println("it is hidden");
	}
	
	WebElement Password=driver.findElement(By.name("pass"));
	Password.sendKeys("123456");
	List<WebElement> tag = driver.findElements(By.tagName("a"));
	for(int i = 0;i<tag.size();i++)
	{
		String text = tag.get(i).getText();
		System.out.println(text);
		
		
	}
	WebElement log=driver.findElement(By.linkText("Log in"));
	if(log.isEnabled())
	{
	String s=	log.getText();
	System.out.println(s);
	log.click();
	System.out.println(s+"button enabled");
	}
	else
	{
		System.out.println("it is not enabled");
	}
	
	WebElement cli=driver.findElement(By.partialLinkText("Log"));
	cli.click();
	WebElement forg=driver.findElement(By.partialLinkText("Forgotten"));
	forg.click();
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("sel");
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	
	
	
	
	
		

	}

}
