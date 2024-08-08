package practice2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	
		public static void main(String[] args) throws IOException, Throwable {
			System.setProperty("webdriver.Chrome.driver", "C:\\Users\\hemas\\Downloads\\edgedriver_win64");
			WebDriver driver = new EdgeDriver();

			// driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
			driver.navigate().to("https://www.flipkart.com");
			driver.findElement(By.name("q")).sendKeys("iphone14",Keys.ENTER);
			driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
			driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[2]")).click();
			driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[3]")).click();
			String parent=driver.getWindowHandle();
			System.out.println(parent);
			Set<String>child=driver.getWindowHandles();
			List<String> d=new ArrayList<>(child);
			driver.switchTo().window(d.get(2));
			 
		System.out.println(driver.findElement(By.xpath("//span[@class='VU-ZEz']")).getText());
			
		/*	 driver.manage().window().maximize();
		WebElement a=	driver.findElement(By.xpath("//iframe[@id='frame1']"));
			 driver.switchTo().frame(a);
			 driver.switchTo().frame("frame3");
			 driver.findElement(By.id("a")).click();
			 driver.switchTo().parentFrame();
			 String text = driver.findElement(By.xpath("//b[@id='topic'] ")).getText();
			System.out.println(text);
			driver.switchTo().defaultContent();
		String a1=	driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(a1);*/
		
		// TODO Auto-generated method stub

	}

}
