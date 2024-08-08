package practice2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	/*	System.setProperty("webdriver.edge.driver", "C:\\Users\\hemas\\eclipse-workspace\\practice\\Testing\\target\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.findElement(By.xpath("//h2[contains(text(),' experienced')]
		
		String str="https://www.facebook.com";
		driver.get(str);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
	//	TakesScreenshot ts = (TakesScreenshot)driver;
	//	File src =  ts.getScreenshotAs(OutputType.FILE);
	//	File dest = new File("C:\\Users\\hemas\\eclipse-workspace\\practice\\Testing\\target\\driver1\\images.png");
	//	FileUtils.copyFile(src, dest);
		WebElement us=driver.findElement(By.id("email"));
		WebElement ps=driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.tagName("button"));
		WebElement down=driver.findElement(By.xpath("//a[text()='Careers']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','hema')",us);
	Object	ob =js.executeScript("return arguments[0].getAttribute('value','hema')",us,ps,login);
	System.out.println(ob);
	//js.executeScript("arguments[2].click()",us,ps,login);
	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView(true)",down);
	Thread.sleep(2000);
	
	js.executeScript("arguments[0].scrollIntoView(false)",us);
	js.executeScript("arguments[0].setAttribute('style','background:Yellow;border:2px solid red')",us);
	String cssValue=us.getCssValue("background-color");
	System.out.println(cssValue);*/
		WebDriver driver = new EdgeDriver();
		
	Runtime.getRuntime().exec("C:\\Users\\hemas\\OneDrive\\Documents\\file.exe");
	
	
	
		
		
	}

}
