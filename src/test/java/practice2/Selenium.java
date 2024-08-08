package practice2;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hemas\\eclipse-workspace\\practice\\Testing\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
		//String s= "https://demo.guru99.com/test/drag_drop.html";
		String s="https://demo.automationtesting.in/Alerts.html";
		
		driver.navigate().to(s);
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Alert a =driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		a.dismiss();
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		Thread.sleep(2000);
	String f	=a.getText();
	System.out.println(f);
	a.sendKeys("Selenium");
	a.accept();
		
	
		
		
		WebElement drag =driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
		WebElement drop = driver.findElement(By.xpath("(//o1[@align=\"center\"])[1]"));
		Actions d = new Actions(driver);
		d.dragAndDrop(drag,drop).build().perform();
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\hemas\\eclipse-workspace\\practice\\Testing\\target\\s.png");
		FileUtils.copyFile(src, des);
		///driver.manage().window().maximize();
	/*	driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to(s);
		WebElement user=driver .findElement(By.id("email"));
		Actions d = new Actions(driver);
		d.sendKeys(user,"hema@gmail.com").perform();d
		d.doubleClick().build().perform();
		d.contextClick().build().perform();
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_DOWN);
		t.keyRelease(KeyEvent.VK_DOWN);
		t.keyPress(KeyEvent.VK_DOWN);
		t.keyRelease(KeyEvent.VK_DOWN);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		t.keyPress(KeyEvent.VK_TAB);
		t.keyRelease(KeyEvent.VK_TAB);
		t.keyPress(KeyEvent.VK_CONTROL);
		t.keyPress(KeyEvent.VK_V);
		t.keyRelease(KeyEvent.VK_CONTROL);
		t.keyRelease(KeyEvent.VK_V);
		
		
		//WebElement mobile=driver.findElement(By.xpath("//span[text()='Mobiles']"));
		///Actions d = new Actions(driver);
		//d.moveToElement(mobile).click().perform();
		//Thread.sleep(2000);
		/*driver.navigate().refresh();
		//driver.switchTo().newWindow(WindowType.TAB);
		String current= driver.getCurrentUrl();
		System.out.println(current);
		if(s.equals(current))
		{
			System.out.println("given url match");
			
		}
		else
		{
			System.out.println("not match");
		}
String title=driver.getTitle();
System.out.println(title);
String d = driver.getPageSource();
System.out.println(d);
WebElement username=driver.findElement(By.id("email"));
username.sendKeys("hemaspeaksu@gmail.com");
username.clear();
username.sendKeys("12345");
WebElement userPassword=driver.findElement(By.xpath("//a[@text()='Forgotten password?']"));
userPassword.sendKeys("hhh");
String attribute = username.getAttribute("value");
System.out.println(attribute);
WebElement button =driver.findElement(By.linkText("Log in"));
button.click();
List<WebElement> elements=driver.findElements(By.tagName("a"));
for(int i=0;i<elements.size();i++)
{
	WebElement e = elements.get(i);
	String text=e.getText();
	System.out.println(text);
}*/
		


	}
	

}
