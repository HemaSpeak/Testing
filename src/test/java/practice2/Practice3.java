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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice3 {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\hemas\\eclipse-workspace\\practice\\Testing\\target\\driver\\msedgedriver.exe" );
	//WebDriverManager.edgeDriver.setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement user=driver.findElement(By.id("Email"));
	WebElement login=driver.findElement(By.tagName("button"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	
	//driver.manage().window().minimize();
	//String a= "https://www.facebook.com";
	/*driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
	//WebElement drag=driver.findElement(By.xpath("(//a[@class=\'button button-orange\'])[5]"));
	///WebElement drop=driver.findElement(By.xpath("(//ol[@align='center'])[1]"));
	driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
	Alert h = driver.switchTo().alert();
	Thread.sleep(2000);
	h.accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
	driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	Thread.sleep(2000);
	h.dismiss();
	//Actions f = new Actions(driver);
	//f.dragAndDrop(drag,drop).build().perform();
	//TakesScreenshot ts=  (TakesScreenshot)(driver);
	//ts.getScreenshotAs(OutputType.FILE);
	//File src = ts.getScreenshotAs(OutputType.FILE);
	//File des = new File("C:\\Users\\hemas\\eclipse-workspace\\practice\\Testing\\target\\driver1.img.png");
	//FileUtils.copyFile(src, des);
	//driver.navigate().forward();
	/*Thread.sleep(2000);
WebElement use=driver.findElement(By.name("email"));
	//WebElement ele1=driver.findElement(By.xpath("//span[text()='Mobiles']"));
	Actions d = new Actions(driver);
	d.sendKeys(use,"Hema").perform();
	d.doubleClick().build().perform();
	d.contextClick().build().perform();
	Robot s = new Robot();
	s.keyPress(KeyEvent.VK_DOWN);
	s.keyRelease(KeyEvent.VK_DOWN);
	s.keyPress(KeyEvent.VK_DOWN);
	s.keyRelease(KeyEvent.VK_DOWN);
	s.keyPress(KeyEvent.VK_DOWN);
	s.keyRelease(KeyEvent.VK_DOWN);
	
	s.keyPress(KeyEvent.VK_ENTER);
	s.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	s.keyPress(KeyEvent.VK_TAB);
	s.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	s.keyPress(KeyEvent.VK_CONTROL);
	
	s.keyPress(KeyEvent.VK_V);
	Thread.sleep(2000);
	s.keyRelease(KeyEvent.VK_CONTROL);
	s.keyRelease(KeyEvent.VK_V);
	
	
	
	
	
	
//	d.moveToElement(ele1).click().perform();
	//driver.navigate().back();
	//String d=driver.getCurrentUrl();
	//System.out.println("the current url is "+d);
	/* if(d.equals(a))
	{
		System.out.println("correct");
	}
	else
	{
		System.out.println("not correct");
	}
	String h =driver.getTitle();
	System.out.println(h); 
	WebElement s= driver.findElement(By.xpath("//input[@type='text']"));
	s.sendKeys("hemaspeaksu");
	s.clear();
	s.sendKeys("pass");
	WebElement ele =driver.findElement(By.linkText("Log in"));
	//WebElement arr=driver.findElement(By.tagName("a"));
	List<WebElement> elements = driver.findElements(By.tagName("a"));
	for(int i=0;i<elements.size();i++)
	{
		WebElement element2=elements.get(i);
		String p = element2.getText();
		System.out.println(p);
		
	}*/
	
	
}
}
